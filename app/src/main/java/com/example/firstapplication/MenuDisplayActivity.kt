package com.example.firstapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuDisplayActivity : AppCompatActivity() {
    val customMenu = com.example.firstapplication.CustomMenu()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_display)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val showPopUp = findViewById<Button>(R.id.menuButton)

        showPopUp.setOnClickListener{
            customMenu.showMenu(this,it)
        }

        val name =  findViewById<TextView>(R.id.name2)
        val rollNum =  findViewById<TextView>(R.id.roll2)
        val fatherName =  findViewById<TextView>(R.id.father2)
        val phone =  findViewById<TextView>(R.id.phone2)

        val intent = intent

        val names:String? = intent.getStringExtra("name")
        val fatherNames = intent.getStringExtra("fathersName")
        val rollNos = intent.getStringExtra("roll")
        val phones = intent.getStringExtra("phone")

        name.text = "Name : $names"
        rollNum.text = "Roll No: $rollNos"
        fatherName.text = "Father's name is $fatherNames"
        phone.text = "Phoine number is: $phones"

    }
}