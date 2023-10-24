package com.example.jetpackapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 기존 방식 findViewById
//        val btn1 : Button = findViewById(R.id.btn1)
//
//        val btn2 : Button = findViewById(R.id.btn2)
//
//        val btn3 : Button = findViewById(R.id.btn3)
//
//        btn1.text = "abc"
//        btn2.text = "abc"
//        btn3.text = "abc"
        // 만약 findViewById를 사용하였을때 일정 갯수 이상의 view가 생성되면 가독성도 떨어지고 찾기가 힘들어짐
        // Kotlin Extensions의 사용
        // 1. gradle의 플러그인에 id ("kotlin-android-extensions") 추가해준다.
//        btn1.text = "abcd"
        // 2. 위와 같은 식으로 접근할 수 있음. 하지만 구글에서 사용을 사용하지 말것을 추천함.
        // Activity를 착각하여 사용시 앱이 죽고 성능이슈또한 존재함.

    }
}