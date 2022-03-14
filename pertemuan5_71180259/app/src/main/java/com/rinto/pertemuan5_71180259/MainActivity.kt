package com.rinto.pertemuan5_71180259

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNama = findViewById<EditText>(R.id.edtNama)
        val btnInputNama = findViewById<Button>(R.id.btnInputNama)

        btnInputNama.setOnClickListener {
            val intent = Intent(this, OutputActivity::class.java)
            intent.putExtra("nama", edtNama.text.toString())
            startActivity(intent)
        }
    }
}