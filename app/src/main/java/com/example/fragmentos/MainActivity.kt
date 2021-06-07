package com.example.fragmentos


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentos.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val search = SearchFragment()
        val heart = HeartFragment()
        val cart = CartFragment()
        val notify = NotificationsFragment()

        binding.bottomNavigation.setOnNavigationItemSelectedListener { it ->   var fragment: Fragment? = null
            when(it.itemId){
                R.id.search_selector -> fragment = search
                R.id.heart_selector -> fragment = heart
                R.id.ticket_selector -> fragment = cart
                R.id.bell_selector -> fragment = notify

            }
            supportFragmentManager
                    .beginTransaction()
                    .setCustomAnimations(R.anim.slide_up, R.anim.slide_down)
                    .replace(R.id.nav_host_fragment, fragment!!)
                    .addToBackStack(fragment.tag)
                    .commit()
            true
        }
    }
}