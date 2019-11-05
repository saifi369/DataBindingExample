package com.saifi369.databindingexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.saifi369.databindingexample.databinding.MainActivityBinding;
import com.saifi369.databindingexample.model.User;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1=findViewById(R.id.tv_first);
        TextView textView2=findViewById(R.id.tv_second);

        textView1.setText("This is first text");
        textView1.setText("This is second text");

    }
}
