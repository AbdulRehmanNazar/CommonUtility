package com.ar.coomonutillib.ui

import android.util.Log
import com.ar.coomonutillib.BuildConfig


/**
 * @Author: Abdul Rehman
 * @Date: 23/10/2023.
 */
class ARLogUtil {
    companion object {
        var SHOW_LOG = true
        fun show(tag: String = BuildConfig.LIBRARY_PACKAGE_NAME, message: String) {
            if (SHOW_LOG) {
                Log.d(tag, message)
            }
        }
    }
}