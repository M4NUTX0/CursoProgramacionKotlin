package com.tutorialesprogramacionya

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tutorialesprogramacionya.proyecto001.Proyecto001
import com.tutorialesprogramacionya.proyecto002.Proyecto002

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun goToProyecto001(view: View) {
        val intent = Intent(this, Proyecto001::class.java)
        startActivity(intent)
    }

    fun goToProyecto002(view: View) {
        val intent = Intent(this, Proyecto002::class.java)
        startActivity(intent)
    }
}