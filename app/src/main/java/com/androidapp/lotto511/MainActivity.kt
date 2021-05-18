package com.androidapp.lotto511

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardRandom = findViewById<CardView>(R.id.cardRandom)
        val cardConstellation = findViewById<CardView>(R.id.cardConstellation)
        val cardName = findViewById<CardView>(R.id.cardName)

        cardRandom.setOnClickListener {
            startActivity(Intent(this@MainActivity, ResultActivity::class.java))
        }
        cardConstellation.setOnClickListener {
            startActivity(Intent(this@MainActivity, ConstellationActivity::class.java))
        }
        cardName.setOnClickListener {
            startActivity(Intent(this@MainActivity, NameActivity::class.java))
        }
    }
}