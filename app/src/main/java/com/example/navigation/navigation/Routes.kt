package com.example.navigation.navigation

sealed class Routes(val route: String) {
    object LoginScreen: Routes("login")
    object HomeScreen: Routes("home")
    object ProfileScreen: Routes("profile")
}