package com.mohanishdesale.streamingapp.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mohanishdesale.streamingapp.ui.fragment.ForyouFragment
import com.mohanishdesale.streamingapp.ui.fragment.NearbyFragment

class PageAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ForyouFragment()
            1 -> NearbyFragment()
            else -> ForyouFragment()
        }
    }

    override fun getItemCount(): Int {
        return 2
    }
}