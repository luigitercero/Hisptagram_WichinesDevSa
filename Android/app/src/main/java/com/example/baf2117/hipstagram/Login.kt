package com.example.baf2117.hipstagram

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registro.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_login.*


class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        unirse.setOnClickListener {
            val intento1 = Intent(this, Registro::class.java)
            startActivity(intento1)
        }
        incognito.setOnClickListener {
            val intento1 = Intent(this, Muro::class.java)
            startActivity(intento1)
        }
    }
}
