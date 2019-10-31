package com.jmdc.trippy.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.jmdc.trippy.R
import com.jmdc.trippy.activities.NewTripActivity

class MyTripsFragment : Fragment() {
    companion object {
        fun getInstance() : MyTripsFragment = MyTripsFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.my_trips_fragment, container, false)

        addEventListenerToAddTripButton(view)

        return view
    }

    private fun addEventListenerToAddTripButton(view: View) {
        val addTripButton = view.findViewById<View>(R.id.fab)
        addTripButton.setOnClickListener { view ->
            Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()

            val intent = Intent(activity, NewTripActivity::class.java).apply {  }
            startActivity(intent)
        }
    }

}