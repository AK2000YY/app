package com.example.app.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.app.core.Routes.REGISTRATION_ROUTE
import com.example.app.navigation.graph.registration

@Composable
fun NavSetup(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = REGISTRATION_ROUTE
    ) {
        registration(
            modifier = modifier.fillMaxSize(),
            navHostController = navHostController
        )

    }
}