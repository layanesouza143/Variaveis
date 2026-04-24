package com.example.variaveis

import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputBinding
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.variaveis.databinding.ActivityMainBinding
import kotlin.math.log

const val indicemasculino = 65
const val indicefeminino = 62
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val items = listOf("Masculino", "Feminino")
        val adapter= ArrayAdapter(this, android.R.layout.simple_spinner_item, items)

        binding.spinnerSexo.adapter = adapter


        binding.buttonCalcular.setOnClickListener {
            val sexoselecionado = binding.spinnerSexo.selectedItem  as String
            val idade = binding.ediTextNome.text.toString().toLongOrNull()

            var resultado: Long=0L

            if (idade!= null){

                if(sexoselecionado.trim()=="Masculino") {
                    if(indicemasculino>idade){
                        resultado = indicemasculino - idade
                    }
                }
                else{if (indicefeminino>idade){
                    resultado= indicefeminino - idade
                    }
                }
                if (resultado!=0L){
                    binding.textViewResultado.text="Faltam $resultado para você se aposentar"
                }else{
                    binding.textViewResultado.text="Você já pode se aposentar"
                }
            }else{
                binding.textViewResultado.text="Informe sua idade"
            }

        }

    }
}