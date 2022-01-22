package com.hsnbyhn.composemoviebrowser.di

import com.hsnbyhn.composemoviebrowser.data.repository.Top250MoviesRepositoryImpl
import com.hsnbyhn.composemoviebrowser.domain.repository.Top250MoviesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by hasanbayhan on 22.01.2022
 **/

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindTop250MoviesRepository(top250MoviesRepositoryImpl: Top250MoviesRepositoryImpl): Top250MoviesRepository
}