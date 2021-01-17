package com.cho.uiuxsamples.portfolio.cv

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.cho.uiuxsamples.R
import com.cho.uiuxsamples.data.DataSource
import kotlinx.android.synthetic.main.fragment_cv.*

class CVFragment : Fragment(R.layout.fragment_cv){
    private lateinit var cvAdapter: CVAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()
        addDataSet()
    }

    private fun initRecyclerView() {
        recyclerview_cv.apply {
            layoutManager = LinearLayoutManager(context)
            cvAdapter = CVAdapter()
            adapter = cvAdapter
        }
    }

    private fun addDataSet() {
        cvAdapter.submitList(DataSource.createCVDataSet())
    }
}