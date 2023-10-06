package com.ar.coomonutillib.ui

import android.content.Context
import android.view.View
import android.widget.Toast


/**
 * @Author: Abdul Rehman
 * @Date: 11/07/2023.
 */

class UiUtil {
    companion object {
        /**
         * Show Toast
         */
        fun showToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }

        /**
         * Utility method to set the visibility of view
         * @param view
         * @param visible  if true then show other hide the view
         */
        fun setViewVisibility(view: View, visible: Boolean) {
            if (visible) {
                view.visibility = View.VISIBLE
            } else {
                view.visibility = View.GONE
            }
        }
    }
}