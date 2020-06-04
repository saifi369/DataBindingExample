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

@BindingAdapter("imageName")
fun setImageFromAssets(view: ImageView, fileName: String) {

    try {
        val bitmap = BitmapFactory.decodeStream(view.context?.assets?.open(fileName))
        view.setImageBitmap(bitmap)
    } catch (e: IOException) {
        e.printStackTrace()
    }

}

@BindingAdapter("imageUrl")
fun loadImageFromInternet(view: ImageView, imageUrl: String) {

    Glide.with(view.context)
            .load(imageUrl)
            .into(view)

}

@BindingAdapter("imageUrl", "placeholderImage")
fun loadImageFromInternet(view: ImageView, imageUrl: String, placeholderImage: String) {

    val requestOptions: RequestOptions = RequestOptions()
            .placeholder(R.drawable.clothes_placeholder)

    Glide.with(view.context)
            .setDefaultRequestOptions(requestOptions)
            .load(imageUrl)
            .into(view)

}

@BindingAdapter("imageUrl", "placeholderImage", "errorImage")
fun loadImageFromInternet(view: ImageView, imageUrl: String, placeholderImage: Boolean, errorImage: Boolean) {

    var requestOptions: RequestOptions = RequestOptions()

    if (placeholderImage) {
        requestOptions.placeholder(R.drawable.clothes_placeholder)
    }
    if (errorImage) {
        requestOptions.error(R.drawable.error_image)
    }

    Glide.with(view.context)
            .setDefaultRequestOptions(requestOptions)
            .load(imageUrl)
            .into(view)

}

@BindingAdapter("imageUrl", "errorImage")
fun loadImageFromInternetWithErrorImage(view: ImageView, imageUrl: String, errorImage: Int) {

    val requestOptions: RequestOptions = RequestOptions()
            .error(errorImage)

    Glide.with(view.context)
            .setDefaultRequestOptions(requestOptions)
            .load(imageUrl)
            .into(view)

}

@BindingAdapter("numberText")
fun setNumber(view: TextView, value: Int) {

    view.text = "($value)"

}

@BindingAdapter("priceText")
fun setPrice(view: TextView, value: Double) {

    val formatter = NumberFormat.getCurrencyInstance()
    val text = "${formatter.format(value)} / each"

    view.text = text

}