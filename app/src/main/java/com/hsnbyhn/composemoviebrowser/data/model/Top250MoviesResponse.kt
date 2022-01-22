package com.hsnbyhn.composemoviebrowser.data.model

/**
 * Created by hasanbayhan on 22.01.2022
 **/
data class Top250MoviesResponse(
    val items: List<Movie>?,
    val errorMessage: String?
)
