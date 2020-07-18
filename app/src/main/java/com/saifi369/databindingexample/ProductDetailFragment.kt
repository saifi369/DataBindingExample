package com.saifi369.databindingexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.saifi369.databindingexample.databinding.FragmentProductDetailBinding
import com.saifi369.databindingexample.model.Product

class ProductDetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = FragmentProductDetailBinding.inflate(inflater, container, false)

        val product = arguments?.getParcelable<Product>("product_key")

        binding.product = product!!
        binding.listener = context as IMainActivity

        return binding.root

    }
}
