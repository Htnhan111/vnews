package com.example.vnews.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainViewpagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    var arrayFragment: ArrayList<Fragment> = arrayListOf<Fragment>();

    override fun getItem(position: Int): Fragment {
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

}