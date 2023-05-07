package com.example.imageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loadImg = findViewById<ImageView>(R.id.loadImg)
        val url = "https://avatars.githubusercontent.com/u/131579912?v=4"

        Glide.with(this)
            .load(url)
           // here placeholder one time show because image cache store
            .placeholder(R.drawable.ic_placeholder)
            .into(loadImg)
    }
}