package com.sultanov.daggerdependency.example2.di

import com.sultanov.daggerdependency.example2.data.datasource.ExampleLocalDataSource
import com.sultanov.daggerdependency.example2.data.datasource.ExampleLocalDataSourceImpl
import com.sultanov.daggerdependency.example2.data.datasource.ExampleRemoteDataSource
import com.sultanov.daggerdependency.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl) : ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl) : ExampleRemoteDataSource
}