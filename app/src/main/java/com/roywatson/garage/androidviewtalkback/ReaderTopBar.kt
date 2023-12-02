package com.roywatson.garage.androidviewtalkback

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp

@Composable
fun ReaderTopBar(
    onReaderSettingsButton: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    Row(
        modifier = Modifier
            .windowInsetsPadding(
                WindowInsets.displayCutout.only(
                    WindowInsetsSides.Horizontal + WindowInsetsSides.Top,
                ),
            )
            .fillMaxWidth()
            .requiredHeight(60.dp)
            .background(Color.LightGray)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
            ) { },
//        contentAlignment = Alignment.Center,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = { onReaderSettingsButton() }
        ) {
            Text("Settings")
        }
        Button(
            onClick = { onReaderSettingsButton() }
        ) {
            Text("Settings")
        }
        Button(
            onClick = { onReaderSettingsButton() }
        ) {
            Text("Settings")
        }
    }
}