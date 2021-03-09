package com.saifi369.databindingexample

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.saifi369.databindingexample.model.Product
import com.saifi369.databindingexample.viewmodels.MainViewModel
import kotlinx.android.synthetic.main.fragment_main.view.*
import java.io.IOException

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_main, container, false)

        val viewModel = ViewModelProviders.of(this)
                .get(MainViewModel::class.java)

        setData(rootView, viewModel.getProduct())

        return rootView

    }

    private fun setData(rootView: View, product: Product) {
        rootView.tv_name.text = product.name
        rootView.tv_price.text = "${product.price}$"
        rootView.tv_description.text = product.description
        rootView.tv_num_rating.text = "(${product.totalRatings})"

        Log.d("MyTag", "inflateViewAndSetData: desc: ${product.description}")

        rootView.iv_product_sale.visibility = if (product.salePrice > 0.0) View.VISIBLE else View.GONE
        rootView.iv_product.setImageBitmap(getBitmapFromAssets(product.image))

    }

    private fun getBitmapFromAssets(fileName: String): Bitmap? {
        return try {
            BitmapFactory.decodeStream(context?.assets?.open(fileName))
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }


}
