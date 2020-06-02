package com.saifi369.databindingexample

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.saifi369.databindingexample.databinding.FragmentMainBinding
import com.saifi369.databindingexample.model.Product
import com.saifi369.databindingexample.viewmodels.MainViewModel
import kotlinx.android.synthetic.main.fragment_main.view.*
import java.io.IOException

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = FragmentMainBinding.inflate(inflater, container, false)

        val viewModel = ViewModelProviders.of(this)
                .get(MainViewModel::class.java)

        binding.product = viewModel.getProduct()

        setData(binding.root, viewModel.getProduct())

        return binding.root

    }

    private fun setData(rootView: View, product: Product) {

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
