package com.example.assesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.assesment.fragments.HistoryFragment
import com.example.assesment.fragments.HomeFragment
import com.example.assesment.fragments.NotificationFragment
import com.example.assesment.fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val historyFragment = HistoryFragment()
        val notificationFragment = NotificationFragment()
        val profileFragment = ProfileFragment()
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        makeCurrentFragment(homeFragment)
        bottomNavigation.setOnItemSelectedListener  { item ->
            when (item.itemId) {
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_history -> makeCurrentFragment(historyFragment)
                R.id.ic_notif -> makeCurrentFragment(notificationFragment)
                R.id.ic_profile -> makeCurrentFragment(profileFragment)
            }
            true
        }


    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}