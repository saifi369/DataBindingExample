package com.saifi369.databindingexample;

import android.os.Bundle;

import com.saifi369.databindingexample.databinding.MainActivityBinding;
import com.saifi369.databindingexample.viewmodels.MainViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mViewModel = ViewModelProviders.of(this)
                .get(MainViewModel.class);

        binding.setMainViewModel(mViewModel);

    }
}
