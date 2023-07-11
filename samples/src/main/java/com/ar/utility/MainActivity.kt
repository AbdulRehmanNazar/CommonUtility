package com.ar.utility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ar.coomonutillib.ui.UiUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.clickMeBtn).setOnClickListener {
            UiUtil.showToast(this@MainActivity, "Clicked")
        }
    }
}