package com.cdp.santabiblia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initEvents ()
    }

    private fun initEvents() {
        val btnAntTest = findViewById<Button>(R.id.btn_antiguo_testamento)
        val btnNueTest = findViewById<Button>(R.id.btn_nue_test)

        btnAntTest.setOnClickListener() {
            val intentAntTest = Intent(this, AntiguoTestamentoActivity::class.java)
            startActivity(intentAntTest)
        }
        btnNueTest.setOnClickListener() {
            val intentNueTest = Intent(this, NuevoTestamentoActivity::class.java)
            startActivity(intentNueTest)
        }
    }
}


