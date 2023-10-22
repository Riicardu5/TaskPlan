package com.example.taskplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Notacoes_principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notacoes_principal)
    }

    public fun IrtelaPrincipal(View: View) {
        val ir_para_tela_principal = Intent(this,Tela_Principal::class.java)
        startActivity(ir_para_tela_principal)

    }

    public fun criarAnotacoes(View: View) {
        val ir_para_criar_anotacoes = Intent(this,criar_anotacoes::class.java)
        startActivity(ir_para_criar_anotacoes)

    }

}