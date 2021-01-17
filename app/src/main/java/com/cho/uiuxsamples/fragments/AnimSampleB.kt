package com.cho.uiuxsamples.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.cho.uiuxsamples.R
import kotlinx.android.synthetic.main.fragment_anim_sample_b.*

class AnimSampleB : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_anim_sample_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        animateAll()

        repeat_animation.setOnClickListener {
//            findNavController().navigate(
//                R.id.action_animationsHomeFragment_to_animSampleB
//            )
            animateAll()
        }
    }

    private fun animateAll() {
        val ttb = AnimationUtils.loadAnimation(context, R.anim.ttb)
        val stb = AnimationUtils.loadAnimation(context, R.anim.stb)
        val btt = AnimationUtils.loadAnimation(context, R.anim.btt)
        val btt2 = AnimationUtils.loadAnimation(context, R.anim.btt2)
        val btt3 = AnimationUtils.loadAnimation(context, R.anim.btt3)
        val btt4 = AnimationUtils.loadAnimation(context, R.anim.btt4)

        headertitle.startAnimation(ttb)
        subtitle.startAnimation(ttb)

        ic_cards.startAnimation(stb)

        resultOne.startAnimation(btt)
        resultTwo.startAnimation(btt2)
        resultThree.startAnimation(btt3)
        repeat_animation.startAnimation(btt4)
    }
}