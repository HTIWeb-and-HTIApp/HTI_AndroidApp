package com.example.authui.componante

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginContent(
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        var idText by remember { mutableStateOf("") }
        var passwordText by remember { mutableStateOf("") }

        Column(
            Modifier
                .fillMaxSize()
                .padding(vertical = 30.dp, horizontal = 30.dp)
                .verticalScroll(rememberScrollState())
        ) {
            AuthTopBar()
            Spacer(modifier = Modifier.height(24.dp))
            AuthImage()
            Spacer(modifier = Modifier.height(24.dp))
            AuthTextField(
                text = idText,
                onValueChange = { idText = it },
                label = "Id"
            )
            PasswordTextField (
                onValueChange = { passwordText = it }
            )
            ForgetPasswordText()
            Spacer(modifier = Modifier.height(20.dp))
            AuthButton(
                onClick = { onClick() },
                buttonColor = Color(0xff14279B),
                text = "LogIn",
                modifier = Modifier
                    .shadow(elevation = 0.dp, shape = RoundedCornerShape(0.2f))
                    .width(350.dp)
                    .height(60.dp)
                    .padding(horizontal = 20.dp, vertical = 2.dp)
            )
        }
    }
}