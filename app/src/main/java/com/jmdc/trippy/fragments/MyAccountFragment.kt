package com.jmdc.trippy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jmdc.trippy.R

class MyAccountFragment : Fragment() {
    companion object {
        fun getInstance() : MyAccountFragment = MyAccountFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.my_account_fragment, container, false)
    }
}