package com.example.servicesui.componante

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

@Composable
fun ServiceTopBar() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "Services",
            color = Color.Black,
            fontFamily = FontFamily.Default,
            fontSize = 22.sp,
            modifier = Modifier.align(
                Alignment.CenterVertically
            )
        )
    }
}