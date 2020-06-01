package com.saifi369.databindingexample.utils

class StringUtils {

    companion object {

        fun getTotalRatings(totalRatings: Int): String {
            return "($totalRatings)"
        }

        fun getPrice(price: Double): String {
            return "$price$"
        }

    }

}