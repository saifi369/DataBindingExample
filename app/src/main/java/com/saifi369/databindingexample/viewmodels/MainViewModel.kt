package com.saifi369.databindingexample.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.saifi369.databindingexample.model.DataProvider
import com.saifi369.databindingexample.model.Product

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var product = DataProvider.productList.get(1)

    fun getProduct(): Product = product

}