package com.example.taskplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class tela_da_conta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_da_conta)
    }

    public fun IrtelaPrincipal(View: View) {
        val ir_para_tela_principal = Intent(this,Tela_Principal::class.java)
        startActivity(ir_para_tela_principal)

    }

    public fun IrtelaInicial(View:View) {
        val ir_para_tela_Inicial = Intent(this, MainActivity::class.java)
        startActivity(ir_para_tela_Inicial)

    }
    }