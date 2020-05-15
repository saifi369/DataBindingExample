package com.saifi369.databindingexample.viewmodels;

import android.app.Application;

import com.saifi369.databindingexample.model.User;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {

    private User mUser;

    public MainViewModel(@NonNull Application application) {
        super(application);

        mUser = new User("Ali", 35);
    }

    public User getUser() {
        return this.mUser;
    }
}
