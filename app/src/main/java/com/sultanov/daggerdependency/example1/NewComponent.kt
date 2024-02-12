package com.sultanov.daggerdependency.example1

import dagger.Component


@Component(modules = [ComponentModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}