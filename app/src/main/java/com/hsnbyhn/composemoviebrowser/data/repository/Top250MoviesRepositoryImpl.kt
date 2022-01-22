package com.hsnbyhn.composemoviebrowser.data.repository

import com.hsnbyhn.composemoviebrowser.BuildConfig
import com.hsnbyhn.composemoviebrowser.data.datasource.ComposeMovieBrowserApi
import com.hsnbyhn.composemoviebrowser.data.model.Movie
import com.hsnbyhn.composemoviebrowser.data.model.Top250MoviesResponse
import com.hsnbyhn.composemoviebrowser.domain.repository.Top250MoviesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

/**
 * Created by hasanbayhan on 22.01.2022
 **/
class Top250MoviesRepositoryImpl @Inject constructor(
    private val composeMovieBrowserApi: ComposeMovieBrowserApi
) : Top250MoviesRepository {

    override fun fetchTop250Movies(onFailure: (String) -> Unit): Flow<List<Movie>?> {
        return flow {
            try {
                val response = composeMovieBrowserApi.fetchTop250Movies(BuildConfig.API_KEY)
                if (response.items.isNullOrEmpty()) {
                    onFailure(response.errorMessage.orEmpty())
                }
                emit(response.items)
            } catch (th: Throwable) {
                onFailure(th.localizedMessage.orEmpty())
            }
        }.flowOn(Dispatchers.IO)
    }
}