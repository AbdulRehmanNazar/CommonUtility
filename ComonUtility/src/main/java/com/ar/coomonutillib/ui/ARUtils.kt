package com.ar.coomonutillib.ui

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities


/**
 * @Author: Abdul Rehman
 * @Date: 03/01/2024.
 */

object ARUtils {

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
                ARLogUtil.show("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR")
                return true
            } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                ARLogUtil.show("Internet", "NetworkCapabilities.TRANSPORT_WIFI")
                return true
            } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
                ARLogUtil.show("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET")
                return true
            }
        }
        return false
    }
}