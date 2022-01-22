package com.hsnbyhn.composemoviebrowser.domain.repository

import com.hsnbyhn.composemoviebrowser.data.model.Movie
import com.hsnbyhn.composemoviebrowser.data.model.Top250MoviesResponse
import kotlinx.coroutines.flow.Flow

/**
 * Created by hasanbayhan on 22.01.2022
 **/
interface Top250MoviesRepository {

    fun fetchTop250Movies(onFailure: (String) -> Unit): Flow<List<Movie>?>
}