package com.example.assesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.bottomsheet.BottomSheetBehavior

class topup : AppCompatActivity() {
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topup)

        // Inisialisasi bottomSheetBehavior
        bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottomSheet))

        val bck = findViewById<ImageView>(R.id.back)
        bck.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://lelogama.go-jek.com/cache/65/50/6550b240f58ee5fca43bc9ebf67285c5.jpg", "Enjoy the cheapest diamond top up!!"))
        imageList.add(SlideModel("https://bebasbikin.com/wp-content/uploads/2022/08/tumnile-1.png", "top up your money before entering the toll road!"))
        imageList.add(SlideModel("https://api.duniagames.co.id/api/content/upload/file/8017305161652955852.png", "Buy the quota immediately before it runs out!"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        // Menggunakan ID linear layout elektrik untuk menampilkan bottom sheet
        val linearElektrik = findViewById<LinearLayout>(R.id.elektrik)
        linearElektrik.setOnClickListener {
            showBottomSheet()
        }

        // Menggunakan ID linear layout game untuk menampilkan bottom sheet
        val linearGame = findViewById<LinearLayout>(R.id.game)
        linearGame.setOnClickListener {
            showBottomSheet()
        }

        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                // Tambahkan logika yang sesuai berdasarkan newState
                // Misalnya, Anda dapat mengubah teks pada buttonBottomSheetPersistent
            }
        })
    }

    // Metode untuk menampilkan bottom sheet
    private fun showBottomSheet() {
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
    }
}
