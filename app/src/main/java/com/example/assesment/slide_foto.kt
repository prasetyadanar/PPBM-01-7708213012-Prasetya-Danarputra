package com.example.assesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class slide_foto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topup)

        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://lelogama.go-jek.com/cache/65/50/6550b240f58ee5fca43bc9ebf67285c5.jpg", "Enjoy the cheapest diamond top up!!"))
        imageList.add(SlideModel("https://img.gnjoy.in.th/2020/10/RO1_Banner-Free-Topup-700x360-1.png", "Elephants and tigers may become extinct."))
        imageList.add(SlideModel("https://api.duniagames.co.id/api/content/upload/file/8017305161652955852.png", "And people do that."))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }
}