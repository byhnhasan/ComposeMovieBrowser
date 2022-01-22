package com.hsnbyhn.composemoviebrowser.ui.bottomnavigation

import com.hsnbyhn.composemoviebrowser.R

/**
 * Created by hasanbayhan on 22.01.2022
 **/

sealed class BottomNavigationItem(var route: String, var icon: Int, var title: Int) {
    object Home : BottomNavigationItem("Home", R.drawable.ic_baseline_home_24, R.string.home)
    object Search : BottomNavigationItem("Search", R.drawable.ic_baseline_search_24, R.string.search)
    object Profile : BottomNavigationItem("Profile", R.drawable.ic_baseline_person_24, R.string.profile)
}

