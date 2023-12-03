package com.roywatson.garage.androidviewtalkback

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun BedrockContent(
    onShowSettings: () -> Unit,
) {
    AndroidView(
        factory = { context ->
            LayoutInflater.from(context).inflate(R.layout.mock_readium_content, null)
        },
        update = { view ->
        },
    )
    AndroidView(
        factory = { context ->
            Button(context).apply {
                text = "Button Button Button"
                layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 250)
                setOnClickListener {
                    onShowSettings()
                }
            }
        },
        update = { view ->
        },
    )

}