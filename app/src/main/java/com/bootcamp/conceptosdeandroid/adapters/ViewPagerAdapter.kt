package com.bootcamp.conceptosdeandroid.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bootcamp.conceptosdeandroid.fragments.ConstraintLayoutFragment
import com.bootcamp.conceptosdeandroid.fragments.CoordinatorLayoutFragment
import com.bootcamp.conceptosdeandroid.fragments.LinearLayoutFragment

private const val NUM_TABS = 3

class ViewPagerAdapter(fragmentManager:FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return  NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> return CoordinatorLayoutFragment()
            1 -> return LinearLayoutFragment()
        }
        return ConstraintLayoutFragment()
    }

}