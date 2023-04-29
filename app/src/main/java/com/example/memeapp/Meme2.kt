package com.example.memeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme2 : AppCompatActivity() {
    lateinit var tilbutton2:Button
    lateinit var tilbutton1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        tilbutton2=findViewById(R.id.tilbutton2)
        tilbutton2.setOnClickListener {
            val intent=Intent (this, Meme3::class.java )
            startActivity(intent)
        }
        tilbutton1=findViewById(R.id.tilbutton1)
        tilbutton1.setOnClickListener {
            val intent=Intent (this, MainActivity::class.java )
            startActivity(intent)
        }
    }
}