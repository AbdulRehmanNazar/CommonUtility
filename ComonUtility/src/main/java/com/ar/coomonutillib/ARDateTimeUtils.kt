package com.ar.coomonutillib

import java.text.SimpleDateFormat


/**
 * @Author: Abdul Rehman
 * @Date: 03/01/2024.
 */
class ARDateTimeUtils {
    companion object {
        const val STANDARD_DATE_TIME_FORMAT = "yyyy-MM-dd hh:mm:ss a"

        fun getStringDateTimeFormatted(timeLong: Long): String {
            return SimpleDateFormat(STANDARD_DATE_TIME_FORMAT).format(timeLong)
        }


    }
}