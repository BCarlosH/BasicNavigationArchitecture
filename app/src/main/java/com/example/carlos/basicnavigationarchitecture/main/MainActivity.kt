package com.example.carlos.basicnavigationarchitecture.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.carlos.basicnavigationarchitecture.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupNavigation()
    }

    private fun setupNavigation() {

        setupActionBarWithNavController(findNavController(R.id.host_fragment))

    }

    override fun onBackPressed() {
        when (NavHostFragment.findNavController(host_fragment).currentDestination?.id) {
            R.id.accountDetails -> {
                //I have done this to simulate the end of a flow
                findNavController(R.id.host_fragment).popBackStack(R.id.mainFragment, false)
            }
            else -> {
                super.onBackPressed()
            }
        }
    }

    override fun onSupportNavigateUp() = NavHostFragment.findNavController(host_fragment).navigateUp()

}
