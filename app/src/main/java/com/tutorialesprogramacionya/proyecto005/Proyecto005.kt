package com.tutorialesprogramacionya.proyecto005

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tutorialesprogramacionya.R

class Proyecto005 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_proyecto005)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val valor1 = findViewById<EditText>(R.id.proyecto005_et_valor1)
        val valor2 = findViewById<EditText>(R.id.proyecto005_et_valor2)
        val seleccion = findViewById<Spinner>(R.id.proyecto005_sp_operacion)
        val lista = arrayOf("sumar", "restar", "multiplicar", "dividir")
        val adaptador = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, lista)
        seleccion.adapter = adaptador

        val calcular = findViewById<Button>(R.id.proyecto005_btn_calcular)
        var resultado = findViewById<TextView>(R.id.proyecto005_tv_resultado)


        calcular.setOnClickListener {
            when (seleccion.selectedItem.toString()) {
                "sumar" -> resultado.text =
                    (valor1.text.toString().toInt() + valor2.text.toString().toInt()).toString()

                "restar" -> resultado.text =
                    (valor1.text.toString().toInt() - valor2.text.toString().toInt()).toString()

                "multiplicar" -> resultado.text =
                    (valor1.text.toString().toInt() * valor2.text.toString().toInt()).toString()

                "dividir" -> resultado.text =
                    (valor1.text.toString().toInt() / valor2.text.toString().toInt()).toString()

            }
        }

    }
}