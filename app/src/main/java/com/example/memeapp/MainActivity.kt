package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var tilbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilbutton=findViewById (R.id.tilbutton)
        tilbutton.setOnClickListener {
            val intent=Intent(this, Meme2::class.java)
            startActivity(intent)
        }

    }
}