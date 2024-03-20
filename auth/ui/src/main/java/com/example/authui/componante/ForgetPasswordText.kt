package com.example.authui.componante

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ForgetPasswordText() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(end = 20.dp),
        horizontalArrangement = Arrangement.End
    ) {
        Text(
            text = "Forget Password",
            color = Color.Gray,
            fontSize = 12.sp,
            textAlign = TextAlign.End
        )
    }
}