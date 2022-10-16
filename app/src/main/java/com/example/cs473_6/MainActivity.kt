package com.example.cs473_6

import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.example.cs473_6.R
import com.example.cs473_6.HomeFragment
import com.example.cs473_6.FeedFragment

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // setContentView(mainLayout);
        bottomNavigationView = findViewById(R.id.bottom_navigation_view)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
        bottomNavigationView.setSelectedItemId(R.id.home)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.title = ""
        setSupportActionBar(toolbar)
    }

    var homeFragment = HomeFragment()
    var feedFragment = FeedFragment()
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.home -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_container_fragment, homeFragment).commit()
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