package com.cho.uiuxsamples.portfolio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.cho.uiuxsamples.R
import com.cho.uiuxsamples.portfolio.cv.CVFragment
import com.cho.uiuxsamples.portfolio.home.PortfolioHomeFragment
import com.cho.uiuxsamples.portfolio.portfolio.PortfolioFragment
import com.cho.uiuxsamples.portfolio.sidemenu.MenuAdapter
import com.cho.uiuxsamples.portfolio.sidemenu.MenuUtil
import com.cho.uiuxsamples.portfolio.team.TeamFragment
import kotlinx.android.synthetic.main.activity_portfolio_main.*

class PortfolioActivity : AppCompatActivity(), MenuAdapter.Interaction {

    private lateinit var adapter: MenuAdapter
    private var selectedMenuPos = 0
    private val menuItems = MenuUtil.getMenuList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portfolio_main)
        // supportActionBar!!.hide()

        setupSideMenu()
        setHomeFragment()
    }

    private fun setupSideMenu() {
        adapter =
            MenuAdapter(menuItems, this)
        rv_side_menu.layoutManager = LinearLayoutManager(this)
        rv_side_menu.adapter = adapter
    }

    private fun setPortfoliofragment() {
        supportFragmentManager.beginTransaction().replace(R.id.container,
            PortfolioFragment()
        )
            .commit()
    }

    private fun setTeamFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.container,
            TeamFragment()
        )
            .commit()
    }

    private fun setCVFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.container,
            CVFragment()
        )
            .commit()
    }

    private fun setHomeFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.container,
            PortfolioHomeFragment()
        )
            .commit()
    }

    override fun onSideMenuItemClick(i: Int) {
        when (menuItems[i].code) {
            MenuUtil.HOME_FRAGMENT_CODE -> setHomeFragment()
            MenuUtil.CV_FRAGMENT_CODE -> setCVFragment()
            MenuUtil.TEAM_FRAGMENT_CODE -> setTeamFragment()
            MenuUtil.PORTFOLIO_FRAGMENT_CODE -> setPortfoliofragment()
            else -> setHomeFragment()
        }

        // hightligh the selected menu item
        menuItems[selectedMenuPos].isSelected = false
        menuItems[i].isSelected = true
        selectedMenuPos = i
        adapter.notifyDataSetChanged()
    }
}