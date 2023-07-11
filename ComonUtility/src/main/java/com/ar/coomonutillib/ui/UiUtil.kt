package com.ar.coomonutillib.ui

import android.content.Context
import android.widget.Toast


/**
 * @Author: Abdul Rehman
 * @Date: 11/07/2023.
 */

class UiUtil {
    companion object {
        fun showToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}