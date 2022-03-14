package com.rinto.pertemuan5_71180259

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OutputActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val nama = intent.getStringExtra("nama")

        val txtOutputNama = findViewById<TextView>(R.id.txtOutputNama)
        txtOutputNama.text = "Hi, Selamat datang ${nama}"
    }
}