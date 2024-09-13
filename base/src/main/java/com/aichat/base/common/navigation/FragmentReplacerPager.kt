package org.ailynx.base.common.navigation

import androidx.fragment.app.Fragment

interface FragmentReplacerPager {
    fun replace(position: Int, newFragment: Fragment, isNotify: Boolean = true)
    fun replaceDef(position: Int, isNotify: Boolean = true) : Fragment
}