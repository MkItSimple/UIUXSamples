package com.cho.uiuxsamples.fragments

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cho.uiuxsamples.MainActivity.Companion.selectedThemeID
import com.cho.uiuxsamples.R
import com.cho.uiuxsamples.SearchActivity
import com.cho.uiuxsamples.adapters.MailAdapter
import com.cho.uiuxsamples.adapters.NavAdapter
import com.cho.uiuxsamples.data.DataSource
import kotlinx.android.synthetic.main.fragment_gmail_template.*
import kotlinx.android.synthetic.main.search_bar.*


@Suppress("DEPRECATION")
class GmailTemplate : Fragment(R.layout.fragment_gmail_template){

    private lateinit var mailAdapter: MailAdapter
    private lateinit var navAdapter: NavAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        selectedThemeID = R.style.DarkTheme;
//        setTheme(selectedThemeID);

//        if (selectedThemeID == R.style.AppTheme) {
//            setLightStatusBar(activity?.window!!.decorView, activity = Activity())
//        }

        initViews()
        initRecyclerView()
        addDataSet()
        initNavMenu()
        addNavDataSet()
        swipeRightToRemove()
    }

    private fun initViews() {
        edit_search.setOnClickListener {
            val intent = Intent(context, SearchActivity::class.java)
            intent.putExtra("themeid", selectedThemeID)
            intent.action = Intent.ACTION_SEARCH
            startActivity(intent)
        }
    }

    private fun swipeRightToRemove() {
        val simpleItemTouchCallback: ItemTouchHelper.SimpleCallback =
            object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT) {
                override fun onMove(
                    recyclerView: RecyclerView,
                    viewHolder: RecyclerView.ViewHolder,
                    target: RecyclerView.ViewHolder
                ): Boolean {
                    Toast.makeText(context, "on Move", Toast.LENGTH_SHORT).show()
                    return false
                }

                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
                    Toast.makeText(context, "on Swiped ", Toast.LENGTH_SHORT).show()
                    //Remove swiped item from list and notify the RecyclerView
                    val position = viewHolder.adapterPosition
                    mailAdapter.notifyItemRemoved(position)
                }
            }
        val itemTouchHelper = ItemTouchHelper(simpleItemTouchCallback)
        itemTouchHelper.attachToRecyclerView(rvmail)
    }

    private fun initNavMenu() {
        menu_icon.setOnClickListener {
            drawer_layout.open()
        }

        nav_rv.apply {
            layoutManager = LinearLayoutManager(context)
            navAdapter = NavAdapter()
            adapter = navAdapter
        }
    }

    private fun addDataSet(){
        mailAdapter.submitList(DataSource.createDataSet())
    }

    private fun addNavDataSet() {
        navAdapter.submitList(DataSource.createNavDataSet())
    }

    private fun initRecyclerView(){

        rvmail.apply {
            layoutManager = LinearLayoutManager(context)
            mailAdapter =
                MailAdapter()
            adapter = mailAdapter
        }
    }

    private fun setLightStatusBar(view: View, activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            var flags = view.systemUiVisibility
            flags = flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            view.systemUiVisibility = flags
            activity.window.statusBarColor = Color.WHITE
        }
    }

}