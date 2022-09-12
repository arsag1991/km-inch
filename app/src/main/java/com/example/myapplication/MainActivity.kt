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

        //try {
            //var a = binding.editText1.text.toString().toFloat()
            //var b = binding.editText2.text.toString().toFloat()
            binding.editText1.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    binding.editText2.setText (p0.toString().toInt() * 39370)
                }

                override fun afterTextChanged(p0: Editable?) {}

            })
            binding.editText2.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    binding.editText1.setText (p0.toString().toInt() / 39370)
                }

                override fun afterTextChanged(p0: Editable?) {}

            })
       // } catch (e: NumberFormatException) {
          //  binding.textView.text = "ERROR"
        }

    }



