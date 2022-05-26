package com.bootcamp.conceptosdeandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.bootcamp.conceptosdeandroid.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

val layoutsNameArray = arrayOf(
    "Coordinator",
    "Linear",
    "Constraint"
)

class ViewPagerActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewpager2)
        val viewPageAdapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        //configuracion del adapter en viewPager2
        viewPager2.adapter = viewPageAdapter

        //vinculación del TabLayout al ViewPager2
        TabLayoutMediator(tabLayout, viewPager2){
            tab, position ->
            tab.text = layoutsNameArray[position]
        }.attach()
    }
}