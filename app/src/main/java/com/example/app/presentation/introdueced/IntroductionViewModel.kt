package com.example.app.presentation.introdueced

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app.domain.model.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class IntroductionViewModel @Inject constructor(
): ViewModel() {

    var response by mutableStateOf<Response<Boolean>>(Response.Success(false))
        private set

    init {
        checkUser()
    }


    private fun checkUser() = viewModelScope.launch {
    }

}