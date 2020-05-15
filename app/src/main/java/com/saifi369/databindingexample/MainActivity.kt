package com.saifi369.databindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.saifi369.databindingexample.databinding.MainActivityBinding
import com.saifi369.databindingexample.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {
    private var mViewModel: MainViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: MainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mViewModel = ViewModelProviders.of(this)
                .get(MainViewModel::class.java)
        binding.mainViewModel = mViewModel
    }
}