package com.example.firstapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstapplication.databinding.ActivityImplicitIntentBinding
import com.example.firstapplication.databinding.ActivityMainBinding

class ImplicitIntent : AppCompatActivity() {
    private val binding:ActivityImplicitIntentBinding by lazy {
        ActivityImplicitIntentBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.openWebpage.setOnClickListener{

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jiomart.com/"))
            startActivity(intent)
        }
        binding.openPhone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+9172299964064")
            startActivity(intent)
        }
        binding.openCamera.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
        binding.textShare.setOnClickListener {}
    }
}