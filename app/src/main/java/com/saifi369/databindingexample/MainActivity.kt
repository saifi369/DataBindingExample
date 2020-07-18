package com.saifi369.databindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.saifi369.databindingexample.databinding.ActivityMainBinding
import com.saifi369.databindingexample.model.DataProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.dataList = DataProvider.productList

    }
}