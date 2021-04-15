package com.example.vnews.Activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.viewpager.widget.ViewPager
import com.example.vnews.Adapter.MainVpAdapter
import com.example.vnews.Fragment.*
import com.example.vnews.R
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    lateinit var nvMenu: NavigationView
    lateinit var drlayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        anhXa()
        init()
    }

    private fun init() {
        var mainVpAdapter : MainVpAdapter = MainVpAdapter(supportFragmentManager)
        mainVpAdapter.addFragment(Fragment_home(), "")
        mainVpAdapter.addFragment(Fragment_technical(), "")
        mainVpAdapter.addFragment(Fragment_hotnews(), "")
        mainVpAdapter.addFragment(Fragment_khampha(), "")
        mainVpAdapter.addFragment(Fragment_profile(), "")
        viewPager.setAdapter(mainVpAdapter)
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_home)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_tech)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_fire)
        tabLayout.getTabAt(3)?.setIcon(R.drawable.ic_compass)
        tabLayout.getTabAt(4)?.setIcon(R.drawable.ic_user)
    }

    private fun anhXa() {
        tabLayout = findViewById(R.id.mytablayout)
        viewPager = findViewById(R.id.myviewpager)
        nvMenu = findViewById(R.id.nvMenu)
        drlayout = findViewById(R.id.drawerlayout)
    }

    fun openMenu(view: View?) {
        drlayout.openDrawer(GravityCompat.END)
    }
}