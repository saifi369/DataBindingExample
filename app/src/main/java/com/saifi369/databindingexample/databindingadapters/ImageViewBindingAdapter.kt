package com.saifi369.databindingexample.databindingadapters

import android.graphics.BitmapFactory
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.saifi369.databindingexample.R
import java.io.IOException
import java.text.NumberFormat
import java.util.*

@BindingAdapter("imageName")
fun setImageFromAssets(view: ImageView, fileName: String) {

    try {
        val bitmap = BitmapFactory.decodeStream(view.context?.assets?.open(fileName))
        view.setImageBitmap(bitmap)
    } catch (e: IOException) {
        e.printStackTrace()
    }

}

@BindingAdapter(value = ["imageUrl", "placeholderImage", "errorImage"], requireAll = false)
fun loadImageFromInternet(view: ImageView, imageUrl: String, placeholderImage: Boolean, errorImage: Boolean) {

    var requestOptions: RequestOptions = RequestOptions()

    if (placeholderImage)
        requestOptions.placeholder(R.drawable.clothes_placeholder)

    if (errorImage)
        requestOptions.placeholder(R.drawable.error_image)

    Glide.with(view.context)
            .setDefaultRequestOptions(requestOptions)
            .load(imageUrl)
            .into(view)

}

@BindingAdapter("priceText")
fun setPriceText(view: TextView, price: Double) {
    val formatter = NumberFormat.getCurrencyInstance(Locale.US)

    view.text = "Rs. $price / each"
}

@BindingAdapter("ratingText")
fun setTotalRatingText(view: TextView, rating: Int) {
    view.text = "($rating)"
}

@BindingAdapter("android:text")
fun setTextViewText(view: TextView, text: Double) {
    view.text = "$text"
}

