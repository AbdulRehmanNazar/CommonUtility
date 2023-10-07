package com.ar.coomonutillib.ui

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


/**
 * @Author: Abdul Rehman
 * @Date: 11/07/2023.
 */

class UiUtil {
    companion object {
        /**
         * Show Toast
         * @param context
         * @param msg Messahe to show
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

        /**
         * Show SnackBar
         * @param view associate with any view
         * @param message Messahe to show
         */
        fun showSnackBar(view: View, message: String) {
            Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
        }
    }
}