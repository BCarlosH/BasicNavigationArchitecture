package com.example.carlos.basicnavigationarchitecture.main


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.carlos.basicnavigationarchitecture.R
import kotlinx.android.synthetic.main.fragment_account_details.*

private const val ARG_ACCOUNT_NAME = "accountNameArg"

class AccountDetails : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvAccountName.text = arguments?.getString(ARG_ACCOUNT_NAME)

        //I have done this to simulate the end of a flow
        btnGoToHome.setOnClickListener { it.findNavController().popBackStack(R.id.mainFragment, false) }
    }

}
