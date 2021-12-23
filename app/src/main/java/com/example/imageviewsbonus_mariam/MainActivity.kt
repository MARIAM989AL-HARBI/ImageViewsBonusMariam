package com.example.imageviewsbonus_mariam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var img1: Button
    lateinit var img2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        img1 = findViewById(R.id.img1)
        img2 = findViewById(R.id.img2)

        img1.setOnClickListener {
            imageView.setImageResource(
                R.drawable.mariam11
            )
        }

        img2.setOnClickListener {
            imageView.setImageResource(
                R.drawable.maraiam22
            )
        }
    }
}