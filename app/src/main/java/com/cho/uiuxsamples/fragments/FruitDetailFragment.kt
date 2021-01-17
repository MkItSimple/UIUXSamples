package com.cho.uiuxsamples.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.transition.TransitionInflater
import com.cho.uiuxsamples.R

class FruitDetailFragment : Fragment(R.layout.fragment_fruit_detail) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedElementEnterTransition = TransitionInflater.from(activity).inflateTransition(
            R.transition.ch_fragment_transition)
        sharedElementReturnTransition = TransitionInflater.from(activity).inflateTransition(
            R.transition.ch_fragment_transition)
    }

    companion object {
        fun newInstance() = FruitDetailFragment()
    }
}