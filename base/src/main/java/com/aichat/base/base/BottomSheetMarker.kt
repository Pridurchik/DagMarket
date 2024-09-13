package com.aichat.base.base

import androidx.annotation.LayoutRes
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

abstract class BottomSheetMarker(
    @LayoutRes layout: Int,
) : BottomSheetDialogFragment(layout)