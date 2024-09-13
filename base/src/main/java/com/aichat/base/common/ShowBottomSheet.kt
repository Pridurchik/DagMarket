package org.ailynx.base.common

import androidx.fragment.app.FragmentManager
import com.aichat.base.base.BottomSheetMarker

object ShowBottomSheet {

    fun showBottomSheet(
        parentFragmentManager: FragmentManager,
        baseBottomSheet: BottomSheetMarker,
        cancelable: Boolean = true
    ) {

        baseBottomSheet.setCancelable(cancelable)
        baseBottomSheet.show(parentFragmentManager, "tag")


    }
}