package com.saifi369.databindingexample

import com.saifi369.databindingexample.model.Product

interface IMainActivity {

    fun onProductClick(product: Product)

    fun onProductImageClick(product: Product)
}