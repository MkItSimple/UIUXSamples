package com.cho.uiuxsamples.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.cho.uiuxsamples.R
import com.cho.uiuxsamples.adapters.MailAdapter
import com.cho.uiuxsamples.data.DataSource
import kotlinx.android.synthetic.main.fragment_anim_sample_c.*

class AnimSampleC : Fragment(R.layout.fragment_anim_sample_c){

    private lateinit var mailAdapter: MailAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        mailAdapter.submitList(DataSource.createDataSet())
    }

    private fun initRecyclerView(){

        recycler_view.apply {
            layoutManager = LinearLayoutManager(context)
            mailAdapter =
                MailAdapter()
            adapter = mailAdapter
        }
    }

}