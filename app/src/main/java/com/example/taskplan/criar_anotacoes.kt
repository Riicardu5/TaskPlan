package com.example.taskplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class criar_anotacoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_anotacoes)
    }
    public fun IrtelaAnotacoes(View: View) {
        val ir_para_tela_das_anotacoes= Intent(this,Notacoes_principal::class.java)
        startActivity(ir_para_tela_das_anotacoes)

    }
}