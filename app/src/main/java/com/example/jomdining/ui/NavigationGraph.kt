package com.example.jomdining.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.ExperimentalMaterial3Api


@Composable
fun NavigationGraph(startDestination: String = "login") {
    val navController = rememberNavController()
    val viewModel: JomDiningViewModel = viewModel(factory = JomDiningViewModel.factory)

    NavHost(navController = navController, startDestination = startDestination) {
        composable("login") {
            LoginScreen(navController = navController)
        }
        composable("register") {
            RegisterScreen(navController = navController)
        }
        composable("main_menu") {
            MainMenuScreen(navController = navController)
        }
        composable("food_ordering") {
            FoodOrderingModuleScreen(viewModel = viewModel)
        }
        // Add other composable routes here
    }
}

