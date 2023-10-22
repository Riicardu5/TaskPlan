package com.example.taskplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Tela_Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)
    }

    public fun IrtelaConta(View: View) {
        val ir_para_tela_da_conta = Intent(this,tela_da_conta::class.java)
        startActivity(ir_para_tela_da_conta)

    }

    public fun IrtelaAnotacoes(View: View) {
        val ir_para_tela_das_anotacoes= Intent(this,Notacoes_principal::class.java)
        startActivity(ir_para_tela_das_anotacoes)

    }

    public fun IrtelaTarefas(View: View) {
        val ir_para_tela_das_tarefas= Intent(this,Tela_tarefas()::class.java)
        startActivity(ir_para_tela_das_tarefas)

    }
}