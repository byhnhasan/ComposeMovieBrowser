package com.hsnbyhn.composemoviebrowser.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hsnbyhn.composemoviebrowser.ui.bottomnavigation.BottomNavigationItem
import com.hsnbyhn.composemoviebrowser.ui.profile.ProfileScreen
import com.hsnbyhn.composemoviebrowser.ui.search.SearchScreen

/**
 * Created by hasanbayhan on 22.01.2022
 **/

@Composable
fun Navigation(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = BottomNavigationItem.Home.route) {
        composable(BottomNavigationItem.Home.route) {
            HomeScreen()
        }

        composable(BottomNavigationItem.Search.route) {
            SearchScreen()
        }

        composable(BottomNavigationItem.Profile.route) {
            ProfileScreen()
        }
    }
    
}