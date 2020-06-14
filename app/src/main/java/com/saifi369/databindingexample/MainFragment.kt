package com.saifi369.databindingexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.saifi369.databindingexample.databinding.FragmentMainBinding
import com.saifi369.databindingexample.model.Product
import com.saifi369.databindingexample.model.ProductViewModel

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = FragmentMainBinding.inflate(inflater, container, false)

        val product = arguments?.getParcelable<Product>("product")

        val productViewModel = ProductViewModel()
        productViewModel.product = product

        binding.productViewModel = productViewModel

        return binding.root

    }

}
