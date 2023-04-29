package com.example.memeapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme5 : AppCompatActivity() {
    lateinit var tilbutton10:Button
    lateinit var tilbutton11:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme5)
        tilbutton10=findViewById (R.id.tilbutton10)
        tilbutton10.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
        tilbutton11=findViewById (R.id.tilbutton11)
        tilbutton11.setOnClickListener {
            val intent = Intent(this, Meme4::class.java)
            startActivity(intent)
        }
        }
}