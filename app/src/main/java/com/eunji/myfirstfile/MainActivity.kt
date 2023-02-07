package com.eunji.myfirstfile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 프로그램이 화면이 클릭되었나는 것을 알아야 한다
        // 변수 만들기 val
        val image1 = findViewById<ImageView>(R.id.isel1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()
        }

        // 2.화면이 클릭되면 다른 화면으로 넘어가서 사진을 크게 보여준다
        val intent = Intent(this, isel1Activity::class.java)
        startActivity(intent)


        //7개의 이미지 네임을 붙이고 각각 클릭 시 다른 액티비티로 이동
        val image2 = findViewById<ImageView>(R.id.isel2)
        val image3 = findViewById<ImageView>(R.id.isel3)
        val image4 = findViewById<ImageView>(R.id.isel4)
        val image5 = findViewById<ImageView>(R.id.isel5)
        val image6 = findViewById<ImageView>(R.id.isel6)
        val image7 = findViewById<ImageView>(R.id.isel7)
        val image8 = findViewById<ImageView>(R.id.isel8)
        val image9 = findViewById<ImageView>(R.id.isel9)

        image2.setOnClickListener {
            val intent = Intent(this, isel2Activity::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener {
            val intent = Intent(this, isel3Activity::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener {
            val intent = Intent(this, isel4Activity::class.java)
            startActivity(intent)
        }
        image5.setOnClickListener {
            val intent = Intent(this, isel5Activity::class.java)
            startActivity(intent)
        }
        image6.setOnClickListener {
            val intent = Intent(this, isel6Activity::class.java)
            startActivity(intent)
        }
        image7.setOnClickListener {
            val intent = Intent(this, isel7Activity::class.java)
            startActivity(intent)
        }
        image8.setOnClickListener {
            val intent = Intent(this, isel8Activity::class.java)
            startActivity(intent)
        }
        image9.setOnClickListener {
            val intent = Intent(this, isel9Activity::class.java)
            startActivity(intent)
        }
    }
}