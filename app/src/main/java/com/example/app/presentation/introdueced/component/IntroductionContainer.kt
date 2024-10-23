package com.example.app.presentation.introdueced.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import com.example.app.R
import com.example.app.core.AppTitle
import com.example.app.ui.theme.FirstBackground
import com.example.app.ui.theme.SecondBackground


@Composable
fun IntroductionContainer(
    modifier: Modifier = Modifier
) {
    val brush = Brush.linearGradient(
        listOf(FirstBackground, SecondBackground)
    )
    Scaffold(
        modifier = modifier
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(brush),
        ) {
            AppTitle(
                modifier = Modifier
                    .align(Alignment.Center)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
            ) {
                Box(modifier = Modifier.weight(1f))
                Image(
                    modifier = Modifier.weight(2f),
                    painter = painterResource(id = R.drawable.background),
                    contentDescription = null
                )
            }
        }
    }
}