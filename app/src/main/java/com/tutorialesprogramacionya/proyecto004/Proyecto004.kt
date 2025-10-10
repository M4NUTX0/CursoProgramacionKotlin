package com.tutorialesprogramacionya.proyecto004

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tutorialesprogramacionya.R

class Proyecto004 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_proyecto004)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val valor1 = findViewById<EditText>(R.id.proyecto004_et_valor1)
        val valor2 = findViewById<EditText>(R.id.proyecto004_et_valor2)
        val check1 = findViewById<CheckBox>(R.id.proyecto004_cb_sumar)
        val check2 = findViewById<CheckBox>(R.id.proyecto004_cb_restar)
        val calcular = findViewById<Button>(R.id.proyecto004_btn_calcular)
        var resultado = findViewById<TextView>(R.id.proyecto004_tv_resultado)

        calcular.setOnClickListener {
            var mensaje = "";
            if (check1.isChecked) {
                mensaje = (valor1.toString().toInt() + valor2.toString().toInt()).toString()
            }
            if (check2.isChecked) {
                mensaje = (valor1.toString().toInt() - valor2.toString().toInt()).toString()
            }
            resultado.text = mensaje
        }
    }
}