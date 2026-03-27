package com.example.tugas2mobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas2mobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var angka = (0 until 11).random()

        binding.buttonTebak.setOnClickListener {

            val input = binding.inputAngka.text.toString()

            if (input.isEmpty()) {
                binding.jawaban.text = "Masukkan angka dulu"
                return@setOnClickListener
            }

            val tebak = input.toInt()

            if (tebak < angka) {
                binding.jawaban.text = "Angka lebih besar"
                binding.angkaBenar.text = ""
            } else if (tebak > angka) {
                binding.jawaban.text = "Angka lebih kecil"
                binding.angkaBenar.text = ""
            } else {
                binding.jawaban.text = "Jawaban benar"
                binding.angkaBenar.text = angka.toString()
                angka = (0 until 11).random()
            }
        }
    }
}

