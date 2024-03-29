package com.sultanov.daggerdependency.example2.data.repository

import com.sultanov.daggerdependency.example2.data.datasource.ExampleLocalDataSource
import com.sultanov.daggerdependency.example2.data.datasource.ExampleRemoteDataSource
import com.sultanov.daggerdependency.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {

    }
}
