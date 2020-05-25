package com.example.tibaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_boarding.*

class OnBoarding : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)

        btn_get_started.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
//        hooks
        val sliderAdapter = SliderAdapter(this)
        slider.adapter = sliderAdapter

    }
}
