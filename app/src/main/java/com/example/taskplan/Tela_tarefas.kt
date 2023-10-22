package com.example.taskplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Tela_tarefas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_tarefas)
    }

    public fun IrtelaPrincipal(View: View) {
        val ir_para_tela_principal = Intent(this, Tela_Principal::class.java)
        startActivity(ir_para_tela_principal)
    }
    public fun IrCriarTarefas(View: View) {
        val ir_para_criar_tarefas = Intent(this, Criar_tarefas::class.java)
        startActivity(ir_para_criar_tarefas)
    }

    }