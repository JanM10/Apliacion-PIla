package com.example.aplicaciondepila

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PrintListActivity : AppCompatActivity() {

    private lateinit var txtSaludo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_list)

        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)

        //Recuperamos la información pasada en el intent
        val saludo = intent.getStringExtra("NOMBRE")

        //Construimos el mensaje a mostrar
        txtSaludo.text = "$saludo"
    }
}