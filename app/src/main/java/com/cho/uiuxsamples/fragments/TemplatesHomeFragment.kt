package com.cho.uiuxsamples.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cho.uiuxsamples.AnimationsActivity
import com.cho.uiuxsamples.MovieHomeActivity
import com.cho.uiuxsamples.R
import com.cho.uiuxsamples.portfolio.PortfolioActivity
import kotlinx.android.synthetic.main.fragment_templates_home.*

class TemplatesHomeFragment : Fragment(R.layout.fragment_templates_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_1.setOnClickListener {
            findNavController().navigate(
                R.id.action_templatesHomeFragment_to_gmailTemplate
            )
        }

        btn_2.setOnClickListener {
            val intent = Intent(context, PortfolioActivity::class.java)
            startActivity(intent)
        }

        btn_3.setOnClickListener {
            val intent = Intent(context, MovieHomeActivity::class.java)
            startActivity(intent)
        }
    }
}