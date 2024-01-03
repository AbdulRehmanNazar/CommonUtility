package com.ar.coomonutillib.ui

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.text.TextUtils
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.Toast
import com.ar.coomonutillib.BuildConfig
import com.google.android.material.snackbar.Snackbar


/**
 * @Author: Abdul Rehman
 * @Date: 03/01/2024.
 */


/**
 * Check email validation
 */
fun String.isValidEmail() =
    !TextUtils.isEmpty(this) && Patterns.EMAIL_ADDRESS.matcher(this).matches()

/**
 * Utility function to check internet connection is online or offline
 */
fun isInternetConnectionAvalible(context: Context): Boolean {
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val capabilities =
        connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
    if (capabilities != null) {
        if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
            return true
        } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
            return true
        } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
            return true
        }
    }
    return false
}

/**
 * Utility function to show Log. Made it
 */
fun showLog(message: String, tag: String = BuildConfig.LIBRARY_PACKAGE_NAME) = Log.d(tag, message)

/**
 * Show Toast
 * @param context
 * @param msg Messahe to show
 */
fun showToast(context: Context, msg: String) =
    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()

/**
 * Show SnackBar
 * @param view associate with any view
 * @param message Messahe to show
 */
fun showSnackBar(view: View, message: String) =
    Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()

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

