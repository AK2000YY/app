package com.example.app.navigation


import com.example.app.core.Routes.APP_SCREEN
import com.example.app.core.Routes.CAMERA_VIEW_SCREEN
import com.example.app.core.Routes.DISCOVERED_FOOD_SCREEN
import com.example.app.core.Routes.FAVOURITE_FOOD_SCREEN
import com.example.app.core.Routes.FIND_OUT_KIND_FOOD_SCREEN
import com.example.app.core.Routes.FOOD_KIND_VIEW
import com.example.app.core.Routes.INTRODUCTORY_SCREEN
import com.example.app.core.Routes.PROFILE_SCREEN
import com.example.app.core.Routes.SIGNUP_LOGIN_SCREEN
import com.example.app.core.Routes.VERIFICATION_SCREEN

sealed class Screen(val route: String) {
    data object IntroducedScreen: Screen(INTRODUCTORY_SCREEN)
    data object SignupLoginScreen: Screen(SIGNUP_LOGIN_SCREEN)
    data object VerificationScreen: Screen(VERIFICATION_SCREEN)
    data object AppScreen: Screen(APP_SCREEN)
    data object FindOutKindFoodScreen: Screen(FIND_OUT_KIND_FOOD_SCREEN)
    data object FoodKindView: Screen(FOOD_KIND_VIEW)
    data object CameraViewScreen: Screen(CAMERA_VIEW_SCREEN)
    data object DiscoveredFoodScreen: Screen(DISCOVERED_FOOD_SCREEN)
    data object FavouriteFoodScreen: Screen(FAVOURITE_FOOD_SCREEN)
    data object ProfileScreen: Screen(PROFILE_SCREEN)
}