package com.example.ejercicio2_desafiopracticodsm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombreET = findViewById<EditText>(R.id.nombre_et)
        val salarioET = findViewById<EditText>(R.id.salario_et)
        val calcularBtn = findViewById<Button>(R.id.calcular_btn)
        val resultadoTV = findViewById<TextView>(R.id.resultado_tv)

        calcularBtn.setOnClickListener {
            val salario = salarioET.text.toString().toDouble()
            val nombre = nombreET.text.toString()
            val iss = salario * 0.03
            val afp = salario * 0.04
            val renta = salario * 0.05
            val salarioNeto = salario - iss - afp - renta

            val format = NumberFormat.getCurrencyInstance()
            val issFormat = format.format(iss)
            val afpFormat = format.format(afp)
            val rentaFormat = format.format(renta)
            val salarioNetoFormat = format.format(salarioNeto)
            val salarioBaseFormat = format.format(salario)

            val resultado = "$nombre, tu salario base es: $salarioBaseFormat\nEl monto de deducciones son los siguientes \nISSS: $issFormat\nAFP: $afpFormat\nRenta: $rentaFormat\nLuego de hacer estas deducciones a tu salario base \nTu Salario neto es: $salarioNetoFormat"
            resultadoTV.text = resultado
        }
    }
}
