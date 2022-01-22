package com.hsnbyhn.composemoviebrowser.data.datasource

import com.hsnbyhn.composemoviebrowser.data.model.Top250MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by hasanbayhan on 22.01.2022
 **/
interface ComposeMovieBrowserApi {

    @GET("{lang}/API/top250Movies/{apiKey}")
    suspend fun fetchTop250Movies(
        @Path("apiKey") apiKey: String,
        @Path("lang") lang: String = "en"
    ): Top250MoviesResponse

}