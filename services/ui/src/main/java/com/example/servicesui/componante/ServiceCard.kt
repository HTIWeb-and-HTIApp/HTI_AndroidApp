package com.example.servicesui.componante

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun ServiceCard(
    serviceName: String,
    serviceIcon: Int
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFF5C7AEA)),
        modifier = Modifier
            .size(width = 180.dp, height = 90.dp)
            .padding(10.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = serviceIcon),
                contentDescription = "This is service icon",
                modifier = Modifier.padding(end = 8.dp, top = 2.dp)
            )
            Text(
                text = serviceName,
                style = TextStyle(color = Color.White),
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 4.dp)
            )
        }

    }
}