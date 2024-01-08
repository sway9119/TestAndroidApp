package com.example.testandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testandroidapp.view.SampleController
import com.example.testandroidapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val controller = SampleController()
        val data = listOf("test") // データを設定
        controller.setData(data)
        binding.recyclerView.adapter = controller.adapter
    }
}