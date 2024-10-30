package com.example.app.navigation


import com.example.app.core.Routes.APP_SCREEN
import com.example.app.core.Routes.INTRODUCTORY_SCREEN
import com.example.app.core.Routes.SIGNUP_LOGIN_SCREEN
import com.example.app.core.Routes.VERIFICATION_SCREEN

sealed class Screen(val route: String) {
    data object IntroducedScreen: Screen(INTRODUCTORY_SCREEN)
    data object SignupLoginScreen: Screen(SIGNUP_LOGIN_SCREEN)
    data object VerificationScreen: Screen(VERIFICATION_SCREEN)
    data object AppScreen: Screen(APP_SCREEN)
}