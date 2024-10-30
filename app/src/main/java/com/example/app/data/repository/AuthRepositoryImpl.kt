package com.example.app.data.repository

import com.example.app.core.Constant.PASSWORDS_DO_NOT_MATCH
import com.example.app.core.Constant.USER_NOT_FOUND
import com.example.app.core.Constant.USER_NOT_VERIFICATION
import com.example.app.domain.model.Response
import com.example.app.domain.repository.AuthRepository
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.delay
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val auth: FirebaseAuth
): AuthRepository {

    override val currentUser: FirebaseUser?
        get() = auth.currentUser

    override suspend fun checkUser(): Response<Boolean> =
        try {
            //check if user is found
            if(currentUser == null) throw Exception(USER_NOT_FOUND)
            //check user is verified
            if(! currentUser!!.isEmailVerified) throw Exception(USER_NOT_VERIFICATION)
            //user is found
            Response.Success(true)
        } catch (e: Exception) {
            Response.Failure(e)
        }

    override suspend fun signup(email: String, password: String, confirmPassword: String): Response<Boolean> =
        try {
            if(password != confirmPassword) throw Exception(PASSWORDS_DO_NOT_MATCH)
            auth.createUserWithEmailAndPassword(email, password).await()
            Response.Success(true)
        } catch (e: Exception) {
            Response.Failure(e)
        }

    override suspend fun login(email: String, password: String): Response<Boolean> =
        try {
            auth.signInWithEmailAndPassword(email, password).await()
            Response.Success(true)
        } catch (e: Exception) {
            Response.Failure(e)
        }

    override suspend fun logout(): Response<Boolean> =
        try {
            auth.signOut()
            Response.Success(true)
        } catch (e: Exception) {
            Response.Failure(e)
        }

    override suspend fun sendEmailVerification(): Response<Boolean> =
        try {
            if(currentUser!!.isEmailVerified) Response.Success(true)
            else {
                currentUser?.sendEmailVerification()?.await()
                Response.Loading
            }
        } catch (e: Exception) {
            Response.Failure(e)
        }

    override suspend fun reload(): Response<Boolean> =
        try {
            while(!currentUser!!.isEmailVerified) {
                currentUser?.reload()?.await()
                delay(2000)
            }
            Response.Success(true)
        } catch (e: Exception) {
            Response.Failure(e)
        }

}