package com.ar.utility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ar.coomonutillib.ui.isInternetConnectionAvalible
import com.ar.coomonutillib.ui.showToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val isOnline = isInternetConnectionAvalible(this@MainActivity)

        findViewById<Button>(R.id.clickMeBtn).setOnClickListener {
            showToast(this@MainActivity, "Clicked")

        }
    }


//    fun String.isValidEmail() =
//        !TextUtils.isEmpty(this) && Patterns.EMAIL_ADDRESS.matcher(this).matches()
}