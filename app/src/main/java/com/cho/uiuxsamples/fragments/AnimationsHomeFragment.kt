package com.cho.uiuxsamples.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cho.uiuxsamples.FruitActivity
import com.cho.uiuxsamples.R
import kotlinx.android.synthetic.main.fragment_animations_home.*

class AnimationsHomeFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_animations_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // transition animation
        btn_1.setOnClickListener {
            val intent = Intent(requireContext(), FruitActivity::class.java)
            startActivity(intent)
        }

        // motion layout sample
        btn_2.setOnClickListener {
            findNavController().navigate(
                R.id.action_animationsHomeFragment_to_motionLayoutFragment
            )
        }

        // recyclerview animation
        btn_3.setOnClickListener {
            findNavController().navigate(
                R.id.action_animationsHomeFragment_to_animSampleA
            )
        }

        // Other animation A
        btn_4.setOnClickListener {
            findNavController().navigate(
                R.id.action_animationsHomeFragment_to_animSampleB
            )
        }
    }
}