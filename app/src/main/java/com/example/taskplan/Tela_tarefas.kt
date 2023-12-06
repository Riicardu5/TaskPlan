package com.example.taskplan

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class Tela_tarefas : AppCompatActivity() {

    private lateinit var lvTarefas: ListView
    private lateinit var tarefasDAO: TarefasDAO
    private lateinit var lTarefas: MutableList<Tarefas>
    private lateinit var adapter: ArrayAdapter<Tarefas>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_tarefas)

        lvTarefas = findViewById(R.id.lvTarefas)
        tarefasDAO = TarefasDAO(this)
        configurarLista()
    }

    private fun configurarLista() {
        lTarefas = tarefasDAO.listarTarefas()
        adapter = TarefasAdapter(this, lTarefas)
        lvTarefas.adapter = adapter
        lvTarefas.setOnItemLongClickListener { _, _, i, _ ->
            val tarefaSelecionada = lTarefas[i]
            Log.d("Tela_tarefas", "ID da tarefa selecionada: " + tarefaSelecionada.getId())
            Log.d("Tela_tarefas", "Item selecionado para exclusão - ID: " + tarefaSelecionada.getId())
            tarefasDAO.excluir(tarefaSelecionada.getId())
            configurarLista() // Atualiza a lista após a exclusão
            true
        }

       // lvTarefas.setOnItemClickListener { _, _, i, _ ->
        //    val tarefaSelecionada = lTarefas[i]
        //    val intent = Intent(this, Criar_tarefas::class.java)
        //    intent.putExtra("ID_TAREFA", tarefaSelecionada.getId())
        //    startActivity(intent)
       // }
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
