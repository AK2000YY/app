package com.example.app.presentation.signupLogin

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app.domain.model.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SignupLoginViewModel @Inject constructor(
): ViewModel() {
    var response by mutableStateOf<Response<Boolean>>(Response.Success(false))
        private set


    var loginEmail by mutableStateOf("")
    var loginPassword by mutableStateOf("")

    var signupEmail by mutableStateOf("")
    var signupPassword by mutableStateOf("")
    var signupConfirmPassword by mutableStateOf("")


    fun login() = viewModelScope.launch {
    }

    fun signup() = viewModelScope.launch {
    }

}