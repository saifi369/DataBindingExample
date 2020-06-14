package com.saifi369.databindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.saifi369.databindingexample.model.Product

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>("product")

        val bundle = Bundle()
        bundle.putParcelable("product", product)

        val fragment = MainFragment()
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
                .add(R.id.product_fragment_container, fragment, "main_fragment")
                .commit()

    }
}