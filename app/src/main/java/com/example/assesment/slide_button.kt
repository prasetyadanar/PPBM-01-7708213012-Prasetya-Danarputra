package com.example.assesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ncorti.slidetoact.SlideToActView

class slide_button : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide_button)

        val slide = findViewById<SlideToActView>(R.id.slide1)

        slide.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener{
            override fun onSlideComplete(view: SlideToActView) {

                val _intent = Intent(this@slide_button, login::class.java)
                startActivity(_intent)
            }
        }
    }
}