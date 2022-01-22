package com.hsnbyhn.composemoviebrowser.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.hsnbyhn.composemoviebrowser.ui.bottomnavigation.BottomNavigation

/**
 * Created by hasanbayhan on 22.01.2022
 **/

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(bottomBar = {
        BottomNavigation(navController = navController)
    }) {
        Navigation(navHostController = navController)
    }
}