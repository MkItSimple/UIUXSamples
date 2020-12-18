package com.cho.uiuxsamples

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_search.*
import kotlinx.android.synthetic.main.search_bar.menu_icon
import java.util.*


@Suppress("DEPRECATION")
class SearchActivity : AppCompatActivity() {
    var editSearch: EditText? = null
    var closeImg: ImageView? = null
    var listView: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        val selectedTheme = intent.getIntExtra("themeid", R.style.AppTheme)
        setTheme(selectedTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        // if light theme is selected we change to light status bar
        if (selectedTheme == R.style.AppTheme) {
            setLightStatusBar(window.decorView, this)
        }
        setEditSearchFocus()
        setBackClickListener()
        setupSimpleSearchList()
    }

    private fun setupSimpleSearchList() {
        lvSearch.divider = null
        val lst: MutableList<String> =
            ArrayList()
        lst.add("Google Mail")
        lst.add("Anna Steve")
        lst.add("Microsoft Store ")
        val adapter =
            ArrayAdapter(this, R.layout.item_simple_search, R.id.searchtvshow, lst)
        lvSearch.adapter = adapter
    }

    private fun setBackClickListener() {
        menu_icon.setOnClickListener(View.OnClickListener {
            closeKeyboard()
            onBackPressed()
        })
    }

    private fun openKeyboard() {
        val imm =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(
            InputMethodManager.SHOW_FORCED,
            InputMethodManager.HIDE_IMPLICIT_ONLY
        )
    }

    private fun closeKeyboard() {
        val imm =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.toggleSoftInput(
            InputMethodManager.SHOW_FORCED,
            InputMethodManager.HIDE_IMPLICIT_ONLY
        )
    }

    private fun setEditSearchFocus() {
        editSearch = findViewById(R.id.eidtsearch)
    }

    companion object {
        fun setLightStatusBar(view: View, activity: Activity) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                var flags = view.systemUiVisibility
                flags = flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                view.systemUiVisibility = flags
                activity.window.statusBarColor = Color.WHITE
            }
        }
    }
}