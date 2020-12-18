package com.cho.uiuxsamples

import android.app.Activity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    companion object{
        var selectedThemeID = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_main)

        selectedThemeID = R.style.DarkTheme
        setTheme(selectedThemeID)

//        if (selectedThemeID == R.style.AppTheme) {
//            setLightStatusBar(activity?.window!!.decorView, activity = Activity())
//        }
    }
}