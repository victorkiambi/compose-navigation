package com.example.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.HomeScreen
import com.example.navigation.LoginScreen
import com.example.navigation.ProfileScreen

@Composable
fun ComposeNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.LoginScreen.route
    ){
        composable(Routes.LoginScreen.route){
            LoginScreen(navController = navController)
        }
        composable(Routes.HomeScreen.route){
            HomeScreen(navController = navController)
        }
        composable(Routes.ProfileScreen.route){
            ProfileScreen()
        }
    }

}