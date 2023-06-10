package com.example.test_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.test_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        var counter:Int = 0
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.dataBindingEx.text = "추천수"
        
        binding.btnAdd.setOnClickListener(){
            counter++
            binding.tvCount.text = counter.toString()
        }
        binding.btnMinus.setOnClickListener(){
            counter--
            binding.tvCount.text = counter.toString()
        }
        binding.button.setOnClickListener{
            val Intent = Intent(this,Activity2::class.java)
            startActivity(Intent)
        }
    }
}
