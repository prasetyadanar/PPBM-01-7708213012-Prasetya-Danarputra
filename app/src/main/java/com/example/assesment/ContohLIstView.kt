package com.example.assesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.assesment.AdapterBuatan
import com.example.assesment.R
import com.example.assesment.databinding.ActivityContohListViewBinding
import com.example.assesment.databinding.ActivityMainBinding


class ContohLIstView : AppCompatActivity() {

    private lateinit var binding: ActivityContohListViewBinding
    private lateinit var userArrayList : ArrayList<datauser>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContohListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(

            R.drawable.kara,
            R.drawable.anselma,
            R.drawable.airin,
            R.drawable.kaia,
            R.drawable.keisya,
            R.drawable.adele
        )

        val name = arrayOf(
            "kara",
            "Anselma",
            "Airin",
            "KaiaHelga",
            "Keisyaa",
            "Adele"
        )

        val tempat = arrayOf(
            "Sate asin mang asoy",
            "Teh poci dago",
            "Nasi kapau",
            "Ayam bakar madu",
            "XXI",
            "FreshMart"

        )

        val country = arrayOf(
            "Indonesia",
            "Indonesia",
            "Indonesia",
            "Indonesia",
            "Indonesia",
            "England"
        )

        val rekening = arrayOf(
            "843770912",
            "892017233",
            "444582901",
            "110983678",
            "778271927",
            "785903203"
        )

        userArrayList = ArrayList()

        for (i in name.indices){

            val user = datauser(name[i], tempat[i], country[i], rekening[i], imageId[i])
            userArrayList.add(user)
        }
        binding.listview3.isClickable = true
        binding.listview3.adapter = AdapterBuatan(this, userArrayList)
        binding.listview3.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val country = country[position]
            val rekening = rekening[position]
            val imageId = imageId[position]

            val i = Intent(this, user::class.java)
            i.putExtra("name",name)
            i.putExtra("country",country)
            i.putExtra("rekening",rekening)
            i.putExtra("imageId",imageId)
            startActivity(i)

        }
    }
}