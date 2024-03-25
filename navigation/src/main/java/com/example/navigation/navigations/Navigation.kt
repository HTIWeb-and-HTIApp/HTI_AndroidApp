package com.example.navigation.navigations

import androidx.navigation.NavHostController

fun navigateToHome(
    navHostController: NavHostController
) {
    navHostController.navigate("HomeScreen") {
        popUpTo("LoginScreen") {
            inclusive = true
        }
    }
}