package com.example.memeapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme3 : AppCompatActivity() {
    lateinit var tilbutton6:Button
    lateinit var tilbutton3:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        tilbutton6=findViewById (R.id.tilbutton6)
        tilbutton6.setOnClickListener {
            val intent=Intent(this, Meme4::class.java)
            startActivity(intent)
        }
        tilbutton3=findViewById (R.id.tilbutton3)
        tilbutton3.setOnClickListener {
            val intent=Intent(this, Meme2::class.java)
            startActivity(intent)
        }
    }
}