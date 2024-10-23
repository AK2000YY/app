package com.example.app.navigation.graph

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.app.core.Routes
import com.example.app.navigation.Screen
import com.example.app.presentation.introdueced.IntroductionScreen
import com.example.app.presentation.signupLogin.SignupLoginScreen
import com.example.app.presentation.verification.VerificationScreen


fun NavGraphBuilder.registration(
    modifier: Modifier,
    navHostController: NavHostController
) {
    navigation(
        route = Routes.REGISTRATION_ROUTE,
        startDestination = Screen.IntroducedScreen.route
    ) {

        composable(
            route = Screen.IntroducedScreen.route
        ) {
            IntroductionScreen(
                modifier = modifier,
                toRegister = {
                    navHostController.navigate(Screen.SignupLoginScreen.route) {
                        popUpTo(navHostController.graph.startDestinationId){
                            inclusive = true
                        }
                    }
                },
                toVerification = {
                    navHostController.navigate(Screen.VerificationScreen.route) {
                        popUpTo(navHostController.graph.startDestinationId) {
                            inclusive = true
                        }
                    }
                },
                toApp =  {
                    navHostController.navigate(Screen.AppScreen.route) {
                        popUpTo(navHostController.graph.startDestinationId){
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable(
            route = Screen.SignupLoginScreen.route
        ) {
            SignupLoginScreen(
                modifier = modifier,
                toVerify = {
                    navHostController.navigate(Screen.VerificationScreen.route) {
                        popUpTo(navHostController.graph.startDestinationId) {
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable(
            route = Screen.VerificationScreen.route
        ) {
            VerificationScreen(
                modifier = modifier,
                toMyApp = {
                    navHostController.navigate(Screen.AppScreen.route) {
                        popUpTo(navHostController.graph.startDestinationId) {
                            inclusive = true
                        }
                    }
                }
            )
        }

    }
}