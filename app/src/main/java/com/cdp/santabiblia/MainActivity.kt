package com.cdp.santabiblia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initEvents()

    }

    private fun initEvents() {
        val button: Bu= findViewById<Button>(R.id.button)
        val button: Button = findViewById<Button>(R.id.button2)
        val button: Button = findViewById<Button>(R.id.button3)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val intent = Intent(this, MainActivity3::class.java)
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }


