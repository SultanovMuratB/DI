package com.sultanov.daggerdependency.example2.di

import android.content.Context
import com.sultanov.daggerdependency.example2.presentation.MainActivity
import com.sultanov.daggerdependency.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    fun inject(activity2: MainActivity2)

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ) : ApplicationComponent
    }
}