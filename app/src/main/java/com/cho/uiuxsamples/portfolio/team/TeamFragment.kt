package com.cho.uiuxsamples.portfolio.team

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.cho.uiuxsamples.R
import kotlinx.android.synthetic.main.fragment_team.*


class TeamFragment : Fragment() {

    private lateinit var adapter: TeamAdapter
    private var mData = ArrayList<TeamItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_team, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // create a list of cv items
        mData.add(
            TeamItem(
                "Choreyn Anania",
                getString(R.string.lorem_text),
                R.drawable.ironman_c
            )
        )
        mData.add(
            TeamItem(
                "Choreyn Anania",
                getString(R.string.lorem_text),
                R.drawable.ironman_c
            )
        )
        mData.add(
            TeamItem(
                "Choreyn Anania",
                getString(R.string.lorem_text2),
                R.drawable.ironman_c
            )
        )
        mData.add(
            TeamItem(
                "Choreyn Anania",
                getString(R.string.lorem_text2),
                R.drawable.ironman_c
            )
        )
        adapter = TeamAdapter(mData)
        rv_team.layoutManager = LinearLayoutManager(context)
        rv_team.adapter = adapter

    }
}