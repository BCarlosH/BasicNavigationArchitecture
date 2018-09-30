package com.example.carlos.basicnavigationarchitecture


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_account.*

private const val ARG_ACCOUNT_NAME = "accountNameArg"

class AccountSelectorFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnAccountNameNext.setOnClickListener {
            val accountName = Bundle()
            accountName.putString(ARG_ACCOUNT_NAME, etAccountName.text.toString())

            it.findNavController().navigate(R.id.accountDetails, accountName)
        }

    }

}
