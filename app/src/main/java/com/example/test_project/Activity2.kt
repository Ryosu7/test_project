package com.example.test_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test_project.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    private lateinit var binding2: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = Activity2Binding.inflate(layoutInflater)
        setContentView(binding2.root)
        binding2.button2.setOnClickListener{
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
            }

        val blankFragment = BlankFragment()
        val blankFragment2 = BlankFragment2()
        val blankFragment3 = BlankFragment3()

        binding2.btn1.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_sample, blankFragment)
                .commit()
        }
        binding2.btn2.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_sample, blankFragment2)
                .commit()
        }
        binding2.btn3.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_sample, blankFragment3)
                .commit()
        }

        }

}