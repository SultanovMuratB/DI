package com.sultanov.daggerdependency.example2.di

import android.content.Context
import com.sultanov.daggerdependency.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ) : ApplicationComponent
    }
}