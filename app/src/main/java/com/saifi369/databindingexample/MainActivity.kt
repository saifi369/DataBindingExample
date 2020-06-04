package com.saifi369.databindingexample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val test: TextView

        supportFragmentManager.beginTransaction()
                .add(R.id.main_fragment_container, MainFragment(), "main_fragment")
                .commit()
    }
}