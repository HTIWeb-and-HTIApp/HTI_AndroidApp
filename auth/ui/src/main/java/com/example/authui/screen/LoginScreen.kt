package com.example.authui.screen

import androidx.compose.runtime.Composable
import com.example.authui.componante.LoginContent

@Composable
fun LoginScreen(
    onClick: () -> Unit
) {
    LoginContent(
        onClick = { onClick() }
    )
}