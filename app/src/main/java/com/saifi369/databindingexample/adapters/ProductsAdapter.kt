package com.saifi369.databindingexample.adapters

import android.content.Context
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saifi369.databindingexample.R
import com.saifi369.databindingexample.model.Product
import kotlinx.android.synthetic.main.product_item.view.*

class ProductsAdapter(private val context: Context, private val dataList: List<Product>)
    : RecyclerView.Adapter<ProductsAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val rootView =
                LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)

        return MyViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val product = dataList[position]

        holder.tvName.text = product.name
        holder.tvPrice.text = "${product.price}$ "
        holder.tvRating.rating = product.rating
        holder.tvNumRating.text = "(${product.totalRatings})"

        try {
            val bitmap = BitmapFactory.decodeStream(context.assets.open(product.image))
            holder.ivProduct.setImageBitmap(bitmap)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        holder.ivSale.visibility = if (product.salePrice > 0) VISIBLE else GONE

    }

    override fun getItemCount() = dataList.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvName = itemView.tv_name
        val tvPrice = itemView.tv_price
        val tvRating = itemView.rating_bar
        val tvNumRating = itemView.tv_num_rating

        val ivProduct = itemView.iv_product
        val ivSale = itemView.iv_product_sale

    }

}