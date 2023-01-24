package com.example.pantallaclases

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imagen = findViewById<ImageView>(R.id.imageView)
        var elfo = findViewById<Button>(R.id.belfo)
        var humano = findViewById<Button>(R.id.bhumano)
        var enano = findViewById<Button>(R.id.benano)
        var goblin = findViewById<Button>(R.id.bgoblin)
        var aceptar = findViewById<Button>(R.id.aceptar)

        elfo.setOnClickListener(){
            imagen.setImageResource(R.drawable.elfo)
        }

        humano.setOnClickListener(){
            imagen.setImageResource(R.drawable.humano)
        }

        enano.setOnClickListener(){
            imagen.setImageResource(R.drawable.enano)
        }

        goblin.setOnClickListener(){
            imagen.setImageResource(R.drawable.goblin)
        }

        aceptar.setOnClickListener(){
            var cambio = Intent(this, MainActivity2::class.java)
            startActivity(cambio)
        }

    }
}