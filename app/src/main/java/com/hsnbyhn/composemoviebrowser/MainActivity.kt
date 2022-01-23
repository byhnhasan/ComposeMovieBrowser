package com.hsnbyhn.composemoviebrowser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.accompanist.pager.ExperimentalPagerApi
import com.hsnbyhn.composemoviebrowser.ui.MainScreen
import com.hsnbyhn.composemoviebrowser.ui.theme.ComposeMovieBrowserTheme
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalPagerApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMovieBrowserTheme {
                // A surface container using the 'background' color from the theme
                MainScreen()
            }
        }
    }
}
