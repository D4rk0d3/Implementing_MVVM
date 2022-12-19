package com.developerstark.frasesfilosoficas.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.developerstark.frasesfilosoficas.databinding.ActivityMainBinding
import com.developerstark.frasesfilosoficas.viewmodel.FraseViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val fraseViewModel : FraseViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fraseViewModel.fraseModel.observe(this, Observer{
            binding.tvFrase.text = it.frase
            binding.tvAutor.text = it.autor
        })
        binding.viewContainer.setOnClickListener{ fraseViewModel.randomFrase()}
    }
}