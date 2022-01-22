package com.hsnbyhn.composemoviebrowser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.hsnbyhn.composemoviebrowser.ui.theme.ComposeMovieBrowserTheme
import com.hsnbyhn.composemoviebrowser.ui.top250.Top250Screen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMovieBrowserTheme {
                // A surface container using the 'background' color from the theme
                Top250Screen(viewModel = hiltViewModel())
            }
        }
    }
}
