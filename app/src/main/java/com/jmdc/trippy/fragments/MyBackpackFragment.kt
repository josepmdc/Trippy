package com.jmdc.trippy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jmdc.trippy.R

class MyBackpackFragment : Fragment() {
    companion object {
        fun getInstance() : MyBackpackFragment = MyBackpackFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.my_backpack_fragment, container, false)
    }
}