package com.hsnbyhn.composemoviebrowser.ui.home

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.hsnbyhn.composemoviebrowser.R
import com.hsnbyhn.composemoviebrowser.ui.home.comingsoon.ComingSoon
import com.hsnbyhn.composemoviebrowser.ui.home.mostpopular.MostPopular
import com.hsnbyhn.composemoviebrowser.ui.home.top250.Top250

/**
 * Created by hasanbayhan on 23.01.2022
 **/


sealed class TabItem(var title: Int, var screen: @Composable () -> Unit) {
    object Top250Movies : TabItem(R.string.top250, { Top250(viewModel = hiltViewModel()) })
    object MostPopularMovies : TabItem(R.string.most_popular, { MostPopular() })
    object ComingSoonMovies : TabItem(R.string.coming_soon, { ComingSoon() })
}