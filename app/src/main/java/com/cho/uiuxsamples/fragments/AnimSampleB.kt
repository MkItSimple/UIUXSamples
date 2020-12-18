package com.cho.uiuxsamples.fragments

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.cho.uiuxsamples.R
import kotlinx.android.synthetic.main.fragment_anim_sample_b.*

class AnimSampleB : Fragment(R.layout.fragment_anim_sample_b){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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
        btn_next_course.startAnimation(btt4)
    }
}