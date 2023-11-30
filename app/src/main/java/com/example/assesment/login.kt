package com.example.assesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var iusername = findViewById<EditText>(R.id.Username)
        var ipassword = findViewById<EditText>(R.id.Password)
        val btn_signup = findViewById<TextView>(R.id.SignUp)
        val btn_login = findViewById<Button>(R.id.Login)

        btn_signup.setOnClickListener {
            val _intent = Intent(this, registrasi::class.java)
            startActivity(_intent)

        }

        btn_login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            var isianusername = iusername.text.toString()
            var isianpassword = ipassword.text.toString()

            if( isianusername != "" &&
                isianpassword != "")
            {
                // B - lanjut ke pengecekkan selanjutnya (username-password match?)
                if( isianusername.equals("telU") &&
                    isianpassword.equals("45-01")){
                    // password + username cocok
                }
                else{
                    Toast.makeText(this, "Wrong Username or Password!", Toast.LENGTH_LONG).show()

                    val alert = AlertDialog.Builder(this)
                    alert.setTitle("Pesan")
                    alert.setMessage("Wrong Username or Password")
                    alert.show()
                }
            }
            else
            {
                // A - kasih peringatan jangan ada yang kosong
            }
        }

    }
}