package com.aichat.features.feature_bottomsheet

import android.content.Context
import android.net.Uri
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.IdRes
import androidx.navigation.NavController
import com.aichat.base.base.BaseBottomSheetDialog
import com.aichat.data.repository.repository.UserRepositoryImpl
import com.aichat.features.DaggerAppComponent
import com.aichat.features.R
import com.aichat.features.databinding.GoogleBottomSheetBinding
import com.aichat.features.feature_auth.domain.model.User
import dagger.internal.DaggerGenerated
import org.ailynx.base.common.ToastMessage
import javax.inject.Inject


class GoogleBottomSheet constructor(
    context: Context,
    @IdRes private val navRes: Int,
    private val navController: NavController
) : BaseBottomSheetDialog<GoogleBottomSheetBinding>(
    context,
    R.layout.google_bottom_sheet,
    GoogleBottomSheetBinding::inflate
) {

    @Inject
    lateinit var userRepositoryImpl: UserRepositoryImpl

    override fun onAttach(context: Context) {
        DaggerAppComponent.factory().factory(requireContext()).inject(this)
        super.onAttach(context)
    }


    override fun setupUi() = with(binding) {
        initWebView()
    }

    private fun initWebView() {
        val webSettings: WebSettings = binding.webView.settings
        webSettings.javaScriptEnabled = true
        binding.webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url == "https://aiprofi.net/app.php?status=error") {
                    ToastMessage.makeToastLong(
                        requireContext(),
                        "Something went wrong"
                    )

                    binding.webView.loadUrl("https://aiprofi.net/login_gg.php?go=1")
                    return true
                } else if (url?.contains("status=ok") == true) {
                    val uri = Uri.parse(url)
                    val emailId = uri.getQueryParameter("em").toString()
                    val passId = uri.getQueryParameter("pass").toString()

                    userRepositoryImpl.saveUser(
                        User(
                            emailId,
                            passId
                        )
                    )

                    navController.navigate(navRes)

                    this@GoogleBottomSheet.dismiss()



                    return false
                } else {
                    return false
                }
            }
        }

        binding.webView.getSettings().userAgentString = System.getProperty("http.agent");
        binding.webView.requestFocus(View.FOCUS_DOWN)
        binding.webView.loadUrl("https://aiprofi.net/login_gg.php?go=1")

    }

}