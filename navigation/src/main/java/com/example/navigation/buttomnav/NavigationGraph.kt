package com.example.navigation.buttomnav

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.authui.screen.LoginScreen
import com.example.homeui.screen.HomeScreen
import com.example.mycoursesui.screen.MyCoursesScreen
import com.example.navigation.navigations.navigateToHome
import com.example.servicesui.screen.ServicesScreen

@Composable
fun NavigationGraph(navController: NavHostController) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val isUSerLogin = false
    val startDestination = if (isUSerLogin) "HomeScreen" else "LoginScreen"

    val bottomNavItems = listOf("HomeScreen", "MyCoursesScreen", "ServicesScreen")

    Scaffold(
        bottomBar = {
            if (currentRoute in bottomNavItems) {
                BottomNavigation(navController = navController)
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier.padding(
                bottom = paddingValues.calculateBottomPadding(),
                top = paddingValues.calculateTopPadding()
            )
        ) {
            NavHost(
                navController,
                startDestination = startDestination
            ) {
                composable(route = "HomeScreen") {
                    HomeScreen()
                }
                composable(route = "MyCoursesScreen") {
                    MyCoursesScreen()
                }
                composable(route = "ServicesScreen") {
                    ServicesScreen()
                }
                composable(route = "LoginScreen") {
                    LoginScreen { navigateToHome(navController) }
                }
            }
        }
    }
}