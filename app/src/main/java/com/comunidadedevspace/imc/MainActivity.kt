package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_Peso)
        val edtAltura =findViewById<TextInputEditText>(R.id.edt_Altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)


        btnCalcular.setOnClickListener {
            val peso= edtPeso.text
            println("Thiago ação do botão   "   +  peso)

            val altura= edtAltura.text
            println("Thiago ação do botão    "  +   altura )
        }

        



    }
}