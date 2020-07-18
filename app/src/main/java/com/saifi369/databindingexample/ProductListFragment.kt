package com.saifi369.databindingexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.saifi369.databindingexample.databinding.FragmentProductListBinding
import com.saifi369.databindingexample.model.DataProvider

class ProductListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding =
                FragmentProductListBinding.inflate(inflater, container, false)

        binding.dataList = DataProvider.productList

        return binding.root
    }

}