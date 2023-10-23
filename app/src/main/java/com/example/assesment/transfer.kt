package com.example.assesment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.assesment.R

class transfer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer)


        val city = arrayOf("Mandiri", "BCA", "BRI")


        val spinner = findViewById<Spinner>(R.id.bank)
        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, city)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    applicationContext,
                    "Selected Bank = " + city[position],
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle nothing selected here, if needed
            }
        }
        val bck = findViewById<ImageView>(R.id.back)

        bck.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
