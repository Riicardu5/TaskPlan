package com.example.taskplan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Criar_tarefas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_tarefas2)
    }

    public fun IrtelaTarefas(View: View) {
        val ir_para_tela_das_tarefas = Intent(this, Tela_tarefas::class.java)
        startActivity(ir_para_tela_das_tarefas)
    }


    public fun mInserirTaref(View: View) {

        val etNomeTaref: EditText = findViewById(R.id.etNomeTaref)
        val etTipoTaref: EditText = findViewById(R.id.etTipoTaref)
        val etDataTaref: EditText = findViewById(R.id.etDataTaref)
        val etHoraTaref: EditText = findViewById(R.id.etHoraTaref)

        val taref = Tarefas(
            0,
            etNomeTaref.text.toString(),
            etTipoTaref.text.toString(),
            etDataTaref.text.toString(),
            etHoraTaref.text.toString()

        )

        val TarefasDAO = TarefasDAO(this)
        val id = TarefasDAO.inserirTaf(taref)

        Toast.makeText(this, "tarefa salva, id: $id", Toast.LENGTH_LONG).show()
    }
}