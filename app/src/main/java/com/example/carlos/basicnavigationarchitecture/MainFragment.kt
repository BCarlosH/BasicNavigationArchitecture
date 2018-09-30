package com.example.carlos.basicnavigationarchitecture


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Two different ways to set the listener. As the second parameter in both of them can we set arguments
        //See AccountSelectorFragment Bundle

        btnGoToAccount.setOnClickListener { it.findNavController().navigate(R.id.accountSelectorFragment) }

        btnGoToSettings.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.settingsFragment))
    }
}