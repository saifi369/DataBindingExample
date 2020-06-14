package com.saifi369.databindingexample.model

import android.os.Parcel
import android.os.Parcelable

data class Product(
        val itemId: String,
        val name: String,
        val description: String,
        val price: Double,
        val salePrice: Double,
        val rating: Float,
        val totalRatings: Int,
        val image: String,
        val errorImage: Int,
        val placeholderImage: Int
) : Parcelable {

    val priceMap = mapOf<String, Double>(
            "price" to price,
            "sale_price" to salePrice
    )

    constructor(parcel: Parcel) : this(
            parcel.readString().toString(),
            parcel.readString().toString(),
            parcel.readString().toString(),
            parcel.readDouble(),
            parcel.readDouble(),
            parcel.readFloat(),
            parcel.readInt(),
            parcel.readString().toString(),
            parcel.readInt(),
            parcel.readInt())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(itemId)
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeDouble(price)
        parcel.writeDouble(salePrice)
        parcel.writeFloat(rating)
        parcel.writeInt(totalRatings)
        parcel.writeString(image)
        parcel.writeInt(errorImage)
        parcel.writeInt(placeholderImage)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Product> {
        override fun createFromParcel(parcel: Parcel): Product {
            return Product(parcel)
        }

        override fun newArray(size: Int): Array<Product?> {
            return arrayOfNulls(size)
        }
    }

}