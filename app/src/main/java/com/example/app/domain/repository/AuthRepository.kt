package com.example.app.domain.repository

import com.example.app.domain.model.Response
import com.google.firebase.auth.FirebaseUser

interface AuthRepository {
    val currentUser: FirebaseUser?

    suspend fun checkUser(): Response<Boolean>

    suspend fun signup(email: String, password: String, confirmPassword: String): Response<Boolean>

    suspend fun login(email: String, password: String): Response<Boolean>

    suspend fun logout(): Response<Boolean>

    suspend fun sendEmailVerification(): Response<Boolean>

    suspend fun reload(): Response<Boolean>
}