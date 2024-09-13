package com.aichat.dagmarket.di

import android.content.Context
import com.aichat.dagmarket.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named


@Component
interface AppComponent {

    @Component.Factory
    interface Factory {
        @Named("AppContext")
        fun create(@BindsInstance context: Context): AppComponent
    }


    fun inject(mainActivity: MainActivity)
}