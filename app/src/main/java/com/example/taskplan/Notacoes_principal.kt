package com.example.taskplan

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class Notacoes_principal : AppCompatActivity() {

    private lateinit var lvAnotacoes: ListView
    private lateinit var anotacaoDao: AnotacaoDao
    private lateinit var lAnotacoes: MutableList<Anotacao>
    private lateinit var adapter: ArrayAdapter<Anotacao>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notacoes_principal)

        lvAnotacoes = findViewById(R.id.lvTarefas)
        anotacaoDao = AnotacaoDao(this)
        configurarLista()
    }

    private fun configurarLista() {
        lAnotacoes = anotacaoDao.listarAnotacoes()
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lAnotacoes)
        lvAnotacoes.adapter = adapter

        lvAnotacoes.setOnItemLongClickListener { _, _, i, _ ->
            val anotacaoSelecionada = lAnotacoes[i]
            Log.d("AnotacaoDao", "Excluir ID: " + anotacaoSelecionada.id)
            anotacaoDao.excluir(anotacaoSelecionada.id)
            configurarLista() // Atualiza a lista após a exclusão
            true
        }

      //  lvAnotacoes.setOnItemClickListener { _, _, i, _ ->
       //     val anotacaoSelecionada = lAnotacoes[i]
        //    val intent = Intent(this, criar_anotacoes::class.java)
        //    intent.putExtra("edicao", true)
        //    intent.putExtra("id", anotacaoSelecionada.id)
        //    intent.putExtra("nome", anotacaoSelecionada.nome)
         //   intent.putExtra("texto", anotacaoSelecionada.texto)
         //   intent.putExtra("atribuicao", anotacaoSelecionada.atribuicao)
         //   startActivity(intent)
         //   finish()
       // }
    }


    //fun excluir(i: Int) {
       // Toast.makeText(this, i.toString(), Toast.LENGTH_SHORT).show()
       // / try{
           //   db = SQLiteDatabase.openOrCreateDatabase("anotacao", null);
           //  String sql = "DELETE FROM anotacao WHERE id =?";
           //  SQLiteStatement stmt = db.compileStatement(sql);
           //  stmt.bindLong(2,arrayIds.get(i));
            // stmt.executeUpdateDelete();
            // listarAnotacoes();


            // }catch(Exception e ){
            //    e.printStackTrace();
            // }

    //}

    public fun IrtelaPrincipal(View: View) {
        val ir_para_tela_principal = Intent(this,Tela_Principal::class.java)
        startActivity(ir_para_tela_principal)

    }

    public fun criarAnotacoes(View: View) {
        val ir_para_criar_anotacoes = Intent(this,criar_anotacoes::class.java)
        startActivity(ir_para_criar_anotacoes)

    }

}