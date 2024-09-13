package com.aichat.features

import android.content.Context
import com.aichat.features.feature_bottomsheet.GoogleBottomSheet
import com.aichat.features.feature_bottomsheet.YandexBottomSheet
import com.aichat.features.features_choosing_in.feature_choosing.ui.MainFragment
import com.aichat.features.features_choosing_in.features_auth.ui.AuthFragment
import com.aichat.features.features_choosing_in.features_login.ui.LoginFragment
import dagger.BindsInstance
import dagger.Component


@Component
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun factory(@BindsInstance context: Context) : AppComponent
    }

    fun inject(mainFragment: MainFragment)
    fun inject(authFragment: AuthFragment)
    fun inject(registFragment: LoginFragment)
    fun inject(googleBottomSheet: GoogleBottomSheet)
    fun inject(yandexBottomSheet: YandexBottomSheet)

}
