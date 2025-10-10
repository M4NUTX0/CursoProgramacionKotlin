package com.tutorialesprogramacionya.proyecto003

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tutorialesprogramacionya.R

class Proyecto003 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_proyecto003)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val valor1 = findViewById<EditText>(R.id.proyecto003_et_valor1)
        val valor2 = findViewById<EditText>(R.id.proyecto003_et_valor2)
        val radio1 = findViewById<RadioButton>(R.id.proyecto003_rb_sumar)
        val radio2 = findViewById<RadioButton>(R.id.proyecto003_rb_restar)
        val calcular = findViewById<Button>(R.id.proyecto003_btn_calcular)
        var resultado = findViewById<TextView>(R.id.proyecto003_tv_resultado)

        calcular.setOnClickListener {
            if (radio1.isSelected) {
                resultado.text = (valor1.toString().toInt() + valor2.toString().toInt()).toString()
            }
            if (radio2.isSelected) {
                resultado.text = (valor1.toString().toInt() - valor2.toString().toInt()).toString()
            }
        }
    }
}