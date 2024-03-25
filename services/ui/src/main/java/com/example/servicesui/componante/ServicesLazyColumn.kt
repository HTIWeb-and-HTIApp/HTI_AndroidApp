package com.example.servicesui.componante

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import com.example.servicesui.R

@Composable
fun ServicesLazyColumn() {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(13) {
            ServiceCard(
                serviceName = "Results",
                serviceIcon = R.drawable.ic_book
            )
        }
    }
}