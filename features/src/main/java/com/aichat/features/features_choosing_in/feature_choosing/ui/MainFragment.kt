package com.aichat.features.features_choosing_in.feature_choosing.ui

import androidx.annotation.IdRes
import androidx.navigation.fragment.findNavController
import com.aichat.features.R
import com.aichat.features.databinding.FragmentMainBinding
import com.aichat.features.feature_bottomsheet.GoogleBottomSheet
import com.aichat.features.feature_bottomsheet.YandexBottomSheet
import org.ailynx.base.base.BaseFragment
import org.ailynx.base.common.ShowBottomSheet

class MainFragment : BaseFragment<FragmentMainBinding>(
    R.layout.fragment_main,
    FragmentMainBinding::inflate
) {
    override fun initUI() = with(binding) {
        registBtn.setOnClickListener {
            navigate_to(R.id.action_mainFragment_to_authFragment)

        }
        logInBtn.setOnClickListener {
            navigate_to(R.id.action_mainFragment_to_loginFragment)
        }
        googleButton.setOnClickListener {
            ShowBottomSheet.showBottomSheet(
                parentFragmentManager = parentFragmentManager,
                GoogleBottomSheet(
                    context = requireContext(),
                    navRes = R.id.action_mainFragment_to_productFragment,
                    navController = findNavController()
                )
            )
        }
        yandexButton.setOnClickListener {
            ShowBottomSheet.showBottomSheet(
                parentFragmentManager = parentFragmentManager,
                baseBottomSheet = YandexBottomSheet(
                    context = requireContext(),
                    navRes = R.id.action_mainFragment_to_productFragment,
                    navController = findNavController()
                )
            )
        }
    }

    private fun navigate_to(
        @IdRes resId: Int
    ) {
        findNavController().navigate(resId)
    }

}