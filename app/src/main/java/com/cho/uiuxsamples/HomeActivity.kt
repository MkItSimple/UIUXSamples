package com.cho.uiuxsamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_1.setOnClickListener {
            val intent = Intent(this, AnimationsActivity::class.java)
            startActivity(intent)
        }

        btn_2.setOnClickListener {
            val intent = Intent(this, TemplatesActivity::class.java)
            startActivity(intent)
        }
    }
}