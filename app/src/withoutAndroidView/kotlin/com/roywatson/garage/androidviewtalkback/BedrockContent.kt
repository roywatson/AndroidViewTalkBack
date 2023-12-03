package com.roywatson.garage.androidviewtalkback

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BedrockContent(
    onShowSettings: () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val fontSize = 36.sp
        Text(text = "Compose Mock Content", fontSize = fontSize)
        Text(text = "Compose Mock Content", fontSize = fontSize)
        Text(text = "Compose Mock Content", fontSize = fontSize)
        Text(text = "Compose Mock Content", fontSize = fontSize)
        Text(text = "Compose Mock Content", fontSize = fontSize)
        Text(text = "Compose Mock Content", fontSize = fontSize)
        Text(text = "Compose Mock Content", fontSize = fontSize)
        Text(text = "Compose Mock Content", fontSize = fontSize)
        Text(text = "Compose Mock Content", fontSize = fontSize)
        Text(text = "Compose Mock Content", fontSize = fontSize)
         Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp),
            onClick = { onShowSettings() }
        ) {
            Text(text = "BUTTON BUTTON BUTTON")
        }




    }


}