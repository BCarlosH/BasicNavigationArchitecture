package com.example.carlos.basicnavigationarchitecture

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
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

    override fun onSupportNavigateUp() = NavHostFragment.findNavController(host_fragment).navigateUp()

}
