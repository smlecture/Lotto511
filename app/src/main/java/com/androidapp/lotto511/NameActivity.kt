package com.androidapp.lotto511

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val btnGoResult = findViewById<Button>(R.id.btnGoResult)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnGoResult.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
        }
        btnBack.setOnClickListener {
            finish()
        }
    }
}