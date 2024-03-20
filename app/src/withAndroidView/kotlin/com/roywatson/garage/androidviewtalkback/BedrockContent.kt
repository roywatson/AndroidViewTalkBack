package com.roywatson.garage.androidviewtalkback

import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.invisibleToUser
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.viewinterop.AndroidView

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun BedrockContent(
    onShowSettings: () -> Unit,
) {
    val activity = LocalContext.current as MainActivity
    AndroidView(
        modifier = Modifier
            .semantics(true) { invisibleToUser() },

        factory = { context ->
            LayoutInflater.from(context).inflate(R.layout.mock_readium_content, null)
        },
        update = { view ->
            Log.v("RHAW", "RHAW")
        },
    )
//    AndroidView(
//        factory = { context ->
//            Button(context).apply {
//                text = "Button Button Button"
//                layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 250)
//                setOnClickListener {
//                    onShowSettings()
//                }
//            }
//        },
//        update = { view ->
//        },
//    )

}