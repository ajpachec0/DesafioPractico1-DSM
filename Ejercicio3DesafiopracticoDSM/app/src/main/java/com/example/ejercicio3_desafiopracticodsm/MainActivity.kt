package com.example.ejercicio3_desafiopracticodsm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        resultado = findViewById(R.id.resultado)

        val botonSumar: Button = findViewById(R.id.btnSumar)
        val botonRestar: Button = findViewById(R.id.btnRestar)
        val botonDividir: Button = findViewById(R.id.btnDividir)
        val botonMultiplicar: Button = findViewById(R.id.btnMultiplicar)

        botonSumar.setOnClickListener { realizarOperacion('+') }
        botonRestar.setOnClickListener { realizarOperacion('-') }
        botonDividir.setOnClickListener { realizarOperacion('/') }
        botonMultiplicar.setOnClickListener { realizarOperacion('*') }
    }

    private fun realizarOperacion(operador: Char) {
        val numero1 = num1.text.toString().toDouble()
        val numero2 = num2.text.toString().toDouble()
        val resultadoOperacion = when (operador) {
            '+' -> numero1 + numero2
            '-' -> numero1 - numero2
            '*' -> numero1 * numero2
            '/' -> numero1 / numero2
            else -> throw IllegalArgumentException("Operador no válido")
        }
        resultado.text = "El resultado es: $resultadoOperacion"
    }
}
