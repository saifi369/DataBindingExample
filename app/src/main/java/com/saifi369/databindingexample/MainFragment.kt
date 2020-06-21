package com.saifi369.databindingexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.saifi369.databindingexample.databinding.FragmentMainBinding
import com.saifi369.databindingexample.model.Product
import com.saifi369.databindingexample.viewmodels.MainViewModel

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding = FragmentMainBinding.inflate(inflater, container, false)

        val viewModel = ViewModelProviders.of(this)
                .get(MainViewModel::class.java)

        binding.product = viewModel.getProduct()
        binding.listener = this

        return binding.root

    }

    fun runCode(product: Product): Boolean {
        Toast.makeText(context, "${product.name} is clicked", Toast.LENGTH_SHORT).show()
        return true
    }

}
