package com.sultanov.daggerdependency.example2.presentation

import com.sultanov.daggerdependency.example1.DaggerNewComponent
import com.sultanov.daggerdependency.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {

    }
}
