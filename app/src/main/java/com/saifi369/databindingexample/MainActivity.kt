package com.saifi369.databindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.saifi369.databindingexample.model.DataProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.setVariable(BR.dataList, DataProvider.productList.toList())

    }

}