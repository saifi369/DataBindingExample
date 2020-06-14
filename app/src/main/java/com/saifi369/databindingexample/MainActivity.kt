package com.saifi369.databindingexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.saifi369.databindingexample.adapters.ProductItemListener
import com.saifi369.databindingexample.adapters.ProductsAdapter
import com.saifi369.databindingexample.model.DataProvider
import com.saifi369.databindingexample.model.Product
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ProductItemListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        rv_products.layoutManager = GridLayoutManager(this, 2)
        rv_products.adapter = ProductsAdapter(this, DataProvider.productList.toList())

    }

    override fun onProductClick(product: Product) {

        val intent = Intent(this, ProductDetailActivity::class.java)
        intent.putExtra("product", product)

        startActivity(intent)


//        supportFragmentManager.beginTransaction()
//                .add(R.id.main_fragment_container, MainFragment(), "main_fragment")
//                .commit()

    }
}