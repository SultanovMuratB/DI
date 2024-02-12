package com.sultanov.daggerdependency.example2.presentation

import androidx.lifecycle.ViewModel
import com.sultanov.daggerdependency.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
) : ViewModel() {

    fun method() {
        repository.method()
    }
}