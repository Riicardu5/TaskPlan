package com.example.taskplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Criar_tarefas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_tarefas2)
    }

    public fun IrtelaTarefas(View: View) {
        val ir_para_tela_das_tarefas= Intent(this,Tela_tarefas()::class.java)
        startActivity(ir_para_tela_das_tarefas)

    }
}