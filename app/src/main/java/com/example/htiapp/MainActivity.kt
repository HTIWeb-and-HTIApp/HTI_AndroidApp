package com.example.htiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.authui.screen.LoginScreen
import com.example.homeui.screen.HomeScreen
import com.example.htiapp.ui.theme.HtiAppTheme
import com.example.navigation.buttomnav.MainScreenView
import com.example.navigation.buttomnav.navigateToHome

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController = rememberNavController()
            HtiAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    LoginScreen(
//                        navigateToHome = { navigateToHome(navController) }
//                    )
                    MainScreenView()
                }
            }
        }
    }
}