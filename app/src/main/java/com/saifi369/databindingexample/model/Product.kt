package com.saifi369.databindingexample.model

data class Product(
        val itemId: String,
        val name: String,
        val description: String,
        val price: Double,
        val salePrice: Double,
        val rating: Float,
        val totalRatings: Int,
        val image: String
)