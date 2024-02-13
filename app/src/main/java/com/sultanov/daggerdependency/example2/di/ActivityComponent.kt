package com.sultanov.daggerdependency.example2.di

import com.sultanov.daggerdependency.example2.presentation.MainActivity
import com.sultanov.daggerdependency.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
    modules = [ViewModelModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(activity2: MainActivity2)

    @Subcomponent.Factory
    interface Factory {

        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String
        ) : ActivityComponent
    }

}