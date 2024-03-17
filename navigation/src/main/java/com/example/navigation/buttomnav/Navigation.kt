package com.example.navigation.buttomnav

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