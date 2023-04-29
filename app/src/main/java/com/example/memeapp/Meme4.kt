package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme4 : AppCompatActivity() {
    lateinit var tilbutton9:Button
    lateinit var tilbutton8:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        tilbutton9 = findViewById(R.id.tilbutton11)
        tilbutton9.setOnClickListener {
            val intent = Intent(this, Meme3::class.java)
            startActivity(intent)
        }
        tilbutton8 = findViewById(R.id.tilbutton8)
        tilbutton8.setOnClickListener {
            val intent = Intent(this, Meme5::class.java)
            startActivity(intent)
        }

    }
}