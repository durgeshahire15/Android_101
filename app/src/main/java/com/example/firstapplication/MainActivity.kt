package com.example.firstapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstapplication.databinding.ActivityMainBinding
import com.example.firstapplication.fragments.BlankFragment1
import com.example.firstapplication.fragments.BlankFragment2

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var manager = supportFragmentManager
        var tr = manager.beginTransaction()
        tr.replace(R.id.frameLayout, BlankFragment2())
        tr.commit()


        binding.button1.setOnClickListener {
            var manager = supportFragmentManager
            var tr = manager.beginTransaction()
            tr.replace(R.id.frameLayout, BlankFragment1())
            tr.commit()
        }
        binding.button2.setOnClickListener {
            var manager = supportFragmentManager
            var tr = manager.beginTransaction()
            tr.replace(R.id.frameLayout, BlankFragment2())
            tr.commit()
        }


    }
    override fun onResume(){
        super.onResume()
    }


}