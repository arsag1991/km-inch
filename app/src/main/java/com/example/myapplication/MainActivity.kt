package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val input = binding.editText1.text.toString().toInt()
            q1(input)
        }

    }

    fun q1(i: Int) {
            for (k in 2..i / 2) {
                if (i >= 2 && i % k != 0) {
                    binding.textView.text = "prime"
                } else if (i == 1 || i == 0) {
                    binding.textView.text = "not prime"
                } else {
                    binding.textView.text = "not prime"
                }
        }
        if (i == null) {binding.textView.text = "Error"}
        return
    }

}