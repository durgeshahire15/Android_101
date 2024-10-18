package com.example.firstapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BundlePassing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bundle_passing)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val name = findViewById<EditText>(R.id.name)
        val fatherName = findViewById<EditText>(R.id.fathername)
        val rollNo = findViewById<EditText>(R.id.rollNo)
        val phone = findViewById<EditText>(R.id.phone)
        val goButtton = findViewById<Button>(R.id.goButton)

        goButtton.setOnClickListener{
            val name = name.text.toString()
            val fatherName = fatherName.text.toString()
            val rollNo = rollNo.text.toString()
            val phone = phone.text.toString()

            val intent = Intent(this, MenuDisplayActivity::class.java)

            intent.putExtra("name", name)
            intent.putExtra("fathersName", fatherName)

            intent.putExtra("roll", rollNo)

            intent.putExtra("phone", phone)
            startActivity(intent)
        }
    }
}