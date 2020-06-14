package com.saifi369.databindingexample.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.saifi369.databindingexample.BR
import com.saifi369.databindingexample.databinding.ProductItemBinding
import com.saifi369.databindingexample.model.Product

class ProductsAdapter(private val context: Context, private val dataList: List<Product>) : RecyclerView.Adapter<ProductsAdapter.BindingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
        val itemBinding: ViewDataBinding =
                ProductItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return BindingViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        val product = dataList.get(position)
//        holder.itemBinding.product = product
//        holder.itemBinding.listener = context as ProductItemListener

        holder.itemBinding.setVariable(BR.product, product)
        holder.itemBinding.setVariable(BR.listener, context as ProductItemListener)
        holder.itemBinding.executePendingBindings()
    }

    override fun getItemCount() = dataList.size


    class BindingViewHolder(
//            val itemBinding: ProductItemBinding,
            val itemBinding: ViewDataBinding
    ) : RecyclerView.ViewHolder(itemBinding.root)

}

interface ProductItemListener {
    fun onProductClick(product: Product)
}