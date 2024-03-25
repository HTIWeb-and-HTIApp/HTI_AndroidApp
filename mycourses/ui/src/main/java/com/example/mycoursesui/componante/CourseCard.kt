package com.example.mycoursesui.componante

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun CourseCard(
    courseName: String
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFF5C7AEA)),
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .padding(8.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = courseName,
                style = TextStyle(color = Color.White),
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 4.dp),
            )
        }
    }
}