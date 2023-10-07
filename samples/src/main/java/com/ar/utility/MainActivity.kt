package com.ar.utility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ar.coomonutillib.ui.ARUiUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.clickMeBtn).setOnClickListener {
            ARUiUtil.showToast(this@MainActivity, "Clicked")
        }
    }
}