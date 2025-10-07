package com.tutorialesprogramacionya.proyecto002

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tutorialesprogramacionya.R

class Proyecto002 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_proyecto002)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val valor1 = findViewById<EditText>(R.id.proyecto002_et_valor1)
        val valor2 = findViewById<EditText>(R.id.proyecto002_et_valor2)
        val resultado = findViewById<TextView>(R.id.proyecto002_tv_resultado)
        val btnCalcular = findViewById<Button>(R.id.proyecto002_btn_calcular)
        btnCalcular.setOnClickListener {
            val suma = valor1.text.toString().toInt() + valor2.text.toString().toInt()
            resultado.text = "Resultado: " + suma
        }
    }


}