package com.example.navigation.buttomnav

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreenView(
){
    val navController = rememberNavController()
    Scaffold {
        NavigationGraph(navController = navController)
    }
}