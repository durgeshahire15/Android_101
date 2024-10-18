package com.example.firstapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            Toast.makeText(this, "Hi, this is my first project", Toast.LENGTH_SHORT).show()
        }

        val button2 = findViewById<Button>(R.id.button8)
        button2.setOnClickListener{
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Delete it")
            alert.setMessage("Do want to delete this?")
            alert.setPositiveButton("Yes"){dialogInterface, which->
                Toast.makeText(this, "You got it deleted",Toast.LENGTH_SHORT).show()
            }
            alert.setNegativeButton("No"){dialogInterface, which->
                Toast.makeText(this, "You got it deleted",Toast.LENGTH_SHORT).show()
            }
            alert.setNeutralButton("cancel"){dialogInterface, which->
                Toast.makeText(this, "You got it deleted",Toast.LENGTH_SHORT).show()
            }

            val box = alert.create()
            box.setCancelable(false)
            box.show()
        }
    }
}