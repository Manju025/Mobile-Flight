package com.example.mobileflight

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This line tells the app to use your activity_main.xml file
        setContentView(R.layout.activity_main)
    }
}