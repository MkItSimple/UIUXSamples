package com.cho.uiuxsamples.portfolio.portfolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.cho.uiuxsamples.R
import kotlinx.android.synthetic.main.fragment_portfolio.*


class PortfolioFragment : Fragment(),
    PortfolioAdapter.Interaction {

    private lateinit var portfolioAdapter: PortfolioAdapter
    private val mData = ArrayList<PortfolioItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_portfolio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mData.add(PortfolioItem(R.drawable.mulan_h))
        mData.add(PortfolioItem(R.drawable.hulk_h))
        mData.add(PortfolioItem(R.drawable.spiderman_h))
        mData.add(PortfolioItem(R.drawable.endgame_h))
        mData.add(PortfolioItem(R.drawable.blackpanter_h))
        mData.add(PortfolioItem(R.drawable.moana_h))
        mData.add(PortfolioItem(R.drawable.spiderman_h))
        mData.add(PortfolioItem(R.drawable.hulk_h))
        mData.add(PortfolioItem(R.drawable.blackpanter_h))

        portfolioAdapter =
            PortfolioAdapter(mData, this)
        rv_portfolio.layoutManager = GridLayoutManager(activity,3)
        rv_portfolio.adapter = portfolioAdapter
    }

    override fun onPortfolioItemClick(pos: Int) {

        val portfolioFragmentDetails =
            PortfolioFragmentDetails()

        val bundle = Bundle()
        bundle.putSerializable("object", mData[pos])
        portfolioFragmentDetails.arguments = bundle

        portfolioFragmentDetails.show(activity!!.supportFragmentManager, "tagname")
    }
}