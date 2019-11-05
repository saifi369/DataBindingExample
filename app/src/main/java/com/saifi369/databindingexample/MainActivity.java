package com.saifi369.databindingexample;

import android.os.Bundle;

import com.saifi369.databindingexample.databinding.MainActivityBinding;
import com.saifi369.databindingexample.model.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User("Ali", 30);
        binding.setUser(user);

    }
}
