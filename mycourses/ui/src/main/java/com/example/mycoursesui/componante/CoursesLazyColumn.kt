package com.example.mycoursesui.componante

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
@Composable
fun CoursesLazyColumn() {
    LazyColumn {
        items(12) {
            CourseCard(courseName = "Database")
        }
    }
}
