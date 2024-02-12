package com.sultanov.daggerdependency.example2.di

import com.sultanov.daggerdependency.example2.data.repository.ExampleRepositoryImpl
import com.sultanov.daggerdependency.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl) : ExampleRepository
}