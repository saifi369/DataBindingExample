package com.saifi369.databindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.saifi369.databindingexample.adapters.ProductsAdapter
import com.saifi369.databindingexample.model.DataProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        rv_products.layoutManager = GridLayoutManager(this, 2)
        rv_products.adapter = ProductsAdapter(this, DataProvider.productList.toList())

    }

}