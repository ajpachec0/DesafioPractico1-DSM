package com.example.ejercicio1_desafiopracticodsm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var nota1EditText: EditText
    private lateinit var nota2EditText: EditText
    private lateinit var nota3EditText: EditText
    private lateinit var nota4EditText: EditText
    private lateinit var nota5EditText: EditText
    private lateinit var calcularButton: Button
    private lateinit var resultadoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Asociar los elementos de la interfaz de usuario con las variables del código
        val nombreEditText = findViewById<EditText>(R.id.nombreEditText)
        nota1EditText = findViewById(R.id.nota1EditText)
        nota2EditText = findViewById(R.id.nota2EditText)
        nota3EditText = findViewById(R.id.nota3EditText)
        nota4EditText = findViewById(R.id.nota4EditText)
        nota5EditText = findViewById(R.id.nota5EditText)
        calcularButton = findViewById(R.id.calcularButton)
        resultadoTextView = findViewById(R.id.resultadoTextView)

        // Definir la acción del botón "Calcular"
        calcularButton.setOnClickListener {
            // Capturar el nombre del estudiante y almacenarlo en una variable
            val nombreEstudiante = nombreEditText.text.toString()

            // Calcular el promedio de las notas y mostrar el resultado en pantalla
            val notas = arrayOf(
                nota1EditText.text.toString().toDouble(),
                nota2EditText.text.toString().toDouble(),
                nota3EditText.text.toString().toDouble(),
                nota4EditText.text.toString().toDouble(),
                nota5EditText.text.toString().toDouble()
            )
            val promedio = notas.average()
            val evaluacion = if (promedio >= 6.0) "Aprobado" else "Reprobado"
            resultadoTextView.text = "El estudiante $nombreEstudiante tiene un promedio de $promedio y está $evaluacion"
        }
    }
}
