package com.jmdc.trippy.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.jmdc.trippy.R
import com.jmdc.trippy.fragments.MyAccountFragment
import com.jmdc.trippy.fragments.MyBackpackFragment
import com.jmdc.trippy.fragments.MyTripsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        this.addEventListenerToBottomNavigationItems(bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.nav_my_trips
    }

    private fun addEventListenerToBottomNavigationItems (bottomNav: BottomNavigationView) {
        bottomNav.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_my_trips -> {
                    val fragment = MyTripsFragment.getInstance()
                    openFragment(fragment)
                    true
                }
                R.id.nav_my_backpack -> {
                    val fragment = MyBackpackFragment.getInstance()
                    openFragment(fragment)
                    true
                }
                R.id.nav_my_account -> {
                    val fragment = MyAccountFragment.getInstance()
                    openFragment(fragment)
                    true
                }
                else -> true
            }
        }
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun showFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.show(fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun hideFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.hide(fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
