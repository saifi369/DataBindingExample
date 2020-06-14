package com.saifi369.databindingexample.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.saifi369.databindingexample.BR

class ProductViewModel : BaseObservable() {

    @get:Bindable
    var product: Product? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.product)
        }

}