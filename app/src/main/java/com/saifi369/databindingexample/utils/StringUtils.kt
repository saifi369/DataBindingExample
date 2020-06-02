package com.saifi369.databindingexample.utils

object StringUtils {

    @JvmStatic
    fun getTotalRatings(totalRating: Int): String {
        return "($totalRating)"
    }

    @JvmStatic
    fun getFormattedPrice(price: Double): String {
        return "$price$"
    }

}