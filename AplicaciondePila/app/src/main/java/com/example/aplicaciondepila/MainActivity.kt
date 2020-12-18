package com.example.aplicaciondepila

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicaciondepila.pila.Stack

class MainActivity : AppCompatActivity() {

    private lateinit var txtNombre : EditText
    private lateinit var btnPush : Button
    private lateinit var btnPop : Button
    private lateinit var btnPrint : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stack = Stack()


        //Obtenemos una referencia a los controles de la interfaz
        txtNombre = findViewById(R.id.txtNombre)
        btnPush = findViewById(R.id.botonPush)
        btnPop = findViewById(R.id.botonPop)
        btnPrint = findViewById(R.id.botonPrint)

        btnPush.setOnClickListener {
            try{
                val dato = txtNombre.text.toString().toInt()
                stack.push(dato)
            }catch (e:Exception){

            }

        }

        btnPop.setOnClickListener {
            stack.pop()
        }

        btnPrint.setOnClickListener {
            //Creamos el Intent
            val intent = Intent(this@MainActivity, PrintListActivity::class.java)

            //Añadimos al intent la información a pasar entre actividades
            intent.putExtra("NOMBRE", stack.getStack())

            //Iniciamos la nueva actividad
            startActivity(intent)
        }
    }
}