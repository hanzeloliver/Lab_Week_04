package com.example.lab_week_04

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiva_title,
    R.string.kopikenangan_title,
)

class CafeAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val context: Context
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }

    override fun createFragment(position: Int): Fragment {
        val content = when (position) {
            0 -> context.getString(R.string.starbucks_desc)
            1 -> context.getString(R.string.janjijiva_desc)
            2 -> context.getString(R.string.kopikenangan_desc)
            else -> ""
        }
        return CafeDetailFragment.newInstance(content)
    }
}