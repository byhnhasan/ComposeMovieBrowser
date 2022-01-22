package com.hsnbyhn.composemoviebrowser.ui.top250

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.hsnbyhn.composemoviebrowser.data.model.Movie

/**
 * Created by hasanbayhan on 22.01.2022
 **/

@Composable
fun Top250Screen(viewModel: Top250ViewModel) {

    val top250Movies: State<List<Movie>?> = viewModel.top250Movies

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Text(text = if (top250Movies.value.isNullOrEmpty()) "loading" else "Success")
    }

}