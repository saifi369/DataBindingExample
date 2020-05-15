package com.saifi369.databindingexample.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.saifi369.databindingexample.model.User

class MainViewModel(application: Application) : AndroidViewModel(application) {
    val user = User("Ali", 35)

}