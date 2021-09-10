package com.nepplus.finalproject_20210910

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.finalproject_20210910.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.textTxt.text = "abcdefg"
    }

}