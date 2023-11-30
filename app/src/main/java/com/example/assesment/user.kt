package com.example.assesment

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assesment.databinding.ActivityUserBinding

class user : AppCompatActivity() {

    private lateinit var binding : ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val country = intent.getStringExtra("country")
        val rekening = intent.getStringExtra("rekening")
        val imageId = intent.getIntExtra("imageId", R.drawable.kara)

        binding.namaTextView.text = name
        binding.negaraTextView.text = country
        binding.noTelpTextView.text = rekening
        binding.fotoImageView.setImageResource(imageId)
    }
}