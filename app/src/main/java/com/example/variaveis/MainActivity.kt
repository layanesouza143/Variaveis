package com.example.variaveis

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.variaveis.databinding.ActivityMainBinding

//Variável imutável: não pode ser alterada nem em tempo de execução
const val VERSAO_DO_APP = "1.0.0"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.buttonMostrar.setOnClickListener {
            val nomeCompleto = binding.ediTextNome.text.toString()
            binding.textViewResultado.text = nomeCompleto
        }

    }
}