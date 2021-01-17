package com.cho.uiuxsamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_shared.*

class SharedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared)

        val fImage  = intent.getIntExtra("fImage", 0)
        val fName  = intent.getStringExtra("fName")

        fruit_image.setImageResource(fImage)
        fruit_name.text = fName
    }
}