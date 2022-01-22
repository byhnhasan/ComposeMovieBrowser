package com.hsnbyhn.composemoviebrowser.ui.Home.top250

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hsnbyhn.composemoviebrowser.data.model.Movie
import com.hsnbyhn.composemoviebrowser.domain.repository.Top250MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by hasanbayhan on 22.01.2022
 **/

@HiltViewModel
class Top250ViewModel @Inject constructor(
    top250MoviesRepository: Top250MoviesRepository
): ViewModel() {

    private val _top250Movies: MutableState<List<Movie>?> = mutableStateOf(null)
    val top250Movies: State<List<Movie>?> get() = _top250Movies

    private val _errorMessage: MutableState<String?> = mutableStateOf(null)
    val errorMessage: State<String?> get() = _errorMessage

    init {
        viewModelScope.launch {
            top250MoviesRepository.fetchTop250Movies(
                onFailure = {
                    _errorMessage.value = it
                }
            ).collect {
                _top250Movies.value = it
            }
        }
    }
}