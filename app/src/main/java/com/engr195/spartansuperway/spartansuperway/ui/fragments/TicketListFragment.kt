package com.engr195.spartansuperway.spartansuperway.ui.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.engr195.spartansuperway.spartansuperway.R

class TicketListFragment: Fragment() {

    companion object {
        fun newInstance(): Fragment {
            val fragment = TicketListFragment()
            // insert arguments here
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_ticket_list, container, false)
}