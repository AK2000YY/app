package com.example.app.core

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.app.ui.theme.SecondBackground

@Composable
fun CustomProgressBar(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black.copy(0.3f)),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            color = SecondBackground
        )
    }
}