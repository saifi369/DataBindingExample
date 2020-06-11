package com.saifi369.databindingexample.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saifi369.databindingexample.R
import com.saifi369.databindingexample.model.Product

class ProductsAdapter(private val dataList: List<Product>) : RecyclerView.Adapter<ProductsAdapter.BindingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_main, parent, false)

        return BindingViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        val product = dataList.get(position)
        setData(holder, product)
    }

    override fun getItemCount() = dataList.size

    private fun setData(holder: BindingViewHolder, product: Product) {

    }

    class BindingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val

    }

}