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

        binding.editText1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (binding.editText1.isFocused) {
                    if (binding.editText1.text.isNotEmpty()) {
                        var h = p0.toString().toFloat()
                        binding.editText2.setText("${h * 39370}")

                    } else {
                        binding.textView.text = "ERROR"
                        binding.editText2.setText("")
                    }
                    return
                }
            }

            override fun afterTextChanged(p0: Editable?) {}
        })

        binding.editText2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (binding.editText2.isFocused) {
                    if (binding.editText2.text.isNotEmpty()) {
                        var h = p0.toString().toFloat()
                        binding.editText1.setText("${h / 39370}")
                    } else {
                        binding.textView.text = "ERROR"
                        binding.editText1.setText("")
                    }
                    return
                }
            }

            override fun afterTextChanged(p0: Editable?) {}
        })

        // } catch (e: Exception) {
        //     binding.textView.text = "ERROR"
        // }
    }
}





