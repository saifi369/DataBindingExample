package com.saifi369.databindingexample.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.saifi369.databindingexample.BR
import com.saifi369.databindingexample.databinding.ProductItemBinding
import com.saifi369.databindingexample.model.Product

class ProductsAdapter(private val context: Context, private val dataList: List<Product>)
    : RecyclerView.Adapter<ProductsAdapter.BindingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {

        val rootView: ViewDataBinding =
                ProductItemBinding.inflate(LayoutInflater.from(context), parent, false)

        return BindingViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        val product = dataList[position]

        holder.itemBinding.setVariable(BR.productItem, product)
        holder.itemBinding.executePendingBindings()

    }

    override fun getItemCount() = dataList.size

    class BindingViewHolder(val itemBinding: ViewDataBinding)
        : RecyclerView.ViewHolder(itemBinding.root)

}