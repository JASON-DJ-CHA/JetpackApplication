package com.example.jetpackapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jetpackapplication.databinding.ActivityViewBindingBinding

//ViewVinding 사용
// 1.     buildFeatures{
//        viewBinding = true
//    } gradle에 추가해주기

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_view_binding)
        // 위 setContentView를 주석 처리 하지 않아도 됨.
        // viewBinding을 사용할때 는 아래와 같이 binding을 불러온 후 infalte적용시킨다.
        // setContentView에 적용시킨 view에 넣어준다.

        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}