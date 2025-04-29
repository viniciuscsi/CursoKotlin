package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtMsg)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        fun mostrarMensagem(view: View){
            val txtMensagem = findViewById<TextView>(R.id.txtMsg)
            txtMensagem.setText("Olá mundo!")
        }
        fun Mais(view: View){
            val txtMensagem = findViewById<TextView>(R.id.txtMsg)
            txtMensagem.setTextSize(txtMensagem.txtSize+1)
        }
        fun  Menos(view: View){
            val txtMensagem = findViewById<TextView>(R.id.txtMsg)
            txtMensagem.setTextSize(txtMensagem.textSize-1)
        }
    }
}