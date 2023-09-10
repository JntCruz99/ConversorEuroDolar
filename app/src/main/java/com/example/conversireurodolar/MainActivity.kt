package com.example.conversireurodolar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversireurodolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener{
            if(!binding.editEuro.text.toString().isEmpty()){
                var euros:Double = binding.editEuro.text.toString().toDouble()
                euros = euros * 1.07
                binding.textView.setText("${euros.toString()}$")
            }else{
                binding.textView.setText("Valor invalido")
            }

        }

    }
}