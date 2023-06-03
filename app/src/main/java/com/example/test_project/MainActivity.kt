package com.example.test_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.test_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.dataBindingEx.text = "추천수"

        var counter:Int = 0

        var tv_count = findViewById<TextView>(R.id.tv_count) //상단에 있는 결과값을 나타내는 변수
        val btn_add = findViewById<Button>(R.id.btn_add) // 수를 + 하는 버튼
        val btn_minus= findViewById<Button>(R.id.btn_minus) //수를 -하는 버튼

        btn_add.setOnClickListener { //+버튼을 누를시
            counter++ //숫자는 1증가
        }
        btn_minus.setOnClickListener { //-버튼을 누를시
            counter-- //숫자는 1감소
        }

    }
}