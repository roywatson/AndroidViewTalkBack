package com.roywatson.garage.androidviewtalkback

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.sp
import androidx.core.content.pm.ShortcutInfoCompat


@Composable
fun AppContent() {
    var showSettings by remember { mutableStateOf(false) }
//    if(!LocalContext.current.isScreenReaderOn()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                BedrockContent(
                    onShowSettings = { showSettings = !showSettings },
                )
            }
        }
//    }
    if(showSettings) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
//                .semantics {
//                    onClick { false }
//                    contentDescription = "Scrim"
//                },
            onClick = {},
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
//                    .semantics {
//                        isTraversalGroup = true
//                    },
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = "Scrim",
                    fontSize = 36.sp,
                )
            }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter,
    ) {
        ReaderTopBar(onReaderSettingsButton = { showSettings = !showSettings})
    }
}