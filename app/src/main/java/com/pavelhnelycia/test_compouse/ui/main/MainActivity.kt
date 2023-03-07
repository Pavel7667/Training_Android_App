package com.pavelhnelycia.test_compouse.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.pavelhnelycia.test_compouse.ui.home.HomeScreen
import com.pavelhnelycia.test_compouse.ui.theme.Game_App
import dagger.hilt.android.AndroidEntryPoint

/**
 * MainActivity entry point for the app and sets the content of the activity to a
 * Composable function called HomeScreen that displays the UI for the app.
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Game_App {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}