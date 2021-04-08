package com.example.vnews.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.vnews.Adapter.MainVpAdapter
import com.example.vnews.Fragment.*
import com.example.vnews.R
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        anhXa()
        init()
    }

    private fun init() {
        var mainVpAdapter : MainVpAdapter = MainVpAdapter(supportFragmentManager)
        mainVpAdapter.addFragment(Fragment_home(), "Home")
        mainVpAdapter.addFragment(Fragment_technical(), "Công nghệ")
        mainVpAdapter.addFragment(Fragment_hotnews(), "Tin nóng")
        mainVpAdapter.addFragment(Fragment_khampha(), "Khám phá")
        mainVpAdapter.addFragment(Fragment_profile(), "Người dùng")
        viewPager.setAdapter(mainVpAdapter)
        tabLayout.setupWithViewPager(viewPager)
    }

    private fun anhXa() {
        tabLayout = findViewById(R.id.mytablayout)
        viewPager = findViewById(R.id.myviewpager)
    }
}