package com.saifi369.databindingexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.saifi369.databindingexample.databinding.FragmentMainBinding
import com.saifi369.databindingexample.viewmodels.MainViewModel


class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding: FragmentMainBinding =
                DataBindingUtil.inflate(layoutInflater, R.layout.fragment_main, container, false)

        val viewModel = ViewModelProviders.of(this)
                .get(MainViewModel::class.java)

        binding.mainViewModel = viewModel

        return binding.root

    }

}
