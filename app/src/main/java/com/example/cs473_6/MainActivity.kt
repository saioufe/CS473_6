package com.example.cs473_6

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // setContentView(mainLayout);
        bottomNavigationView = findViewById(R.id.bottom_navigation_view)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
        bottomNavigationView.selectedItemId = R.id.feed
//        val toolbar = findViewById<Toolbar>(R.id.toolbar)
//        toolbar.title = ""
//        setSupportActionBar(toolbar)

    }

   // var homeFragment = HomeFragment()
    var feedFragment = FeedFragment()
    var aboutMeFragment = AboutMeFragment()
    var experienceFragment = ExperienceFragment()
    var contactFragment = ContactFragment()
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
//            R.id.home -> {
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.main_container_fragment, homeFragment).commit()
//                true
//            }
            R.id.aboutme -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_container_fragment, aboutMeFragment).commit()
                true
            }
            R.id.experience -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_container_fragment, experienceFragment).commit()
                true
            }
            R.id.contactinfo -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_container_fragment, contactFragment).commit()
                true
            }
            else -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_container_fragment, feedFragment).commit()
                true
            }
        }
    }
}