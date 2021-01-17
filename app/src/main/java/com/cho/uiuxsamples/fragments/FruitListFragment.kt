package com.cho.uiuxsamples.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.transition.TransitionInflater
import com.cho.uiuxsamples.FruitActivity
import com.cho.uiuxsamples.FruitAdapter
import com.cho.uiuxsamples.R
import com.cho.uiuxsamples.data.DataSource
import com.cho.uiuxsamples.data.model.FruitItem
import kotlinx.android.synthetic.main.fragment_fruit_list.*

class FruitListFragment : Fragment(R.layout.fragment_fruit_list), FruitAdapter.Interaction {

    private lateinit var fruitAdapter: FruitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedElementEnterTransition = TransitionInflater.from(activity).inflateTransition(R.transition.ch_fragment_transition)
        sharedElementReturnTransition = TransitionInflater.from(activity).inflateTransition(R.transition.ch_fragment_transition)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        imageView2.setOnClickListener {
//            (activity as MainActivity).changeDetailFragment(it)
//        }

        initRecyclerView()
        addDataSet()
    }

    private fun initRecyclerView() {
        recyclerview_cv.apply {
            layoutManager = LinearLayoutManager(context)
            fruitAdapter = FruitAdapter(
                this@FruitListFragment
            )
            adapter = fruitAdapter
        }
    }

    private fun addDataSet() {
        fruitAdapter.submitList(DataSource.createFruitDataSet())
    }

    companion object {
        fun newInstance() = FruitListFragment()
    }

    override fun onItemSelected(
        position: Int,
        item: FruitItem,
        itemView: View
    ) {

        (activity as FruitActivity).changeDetailFragment(itemView, item)
    }

}