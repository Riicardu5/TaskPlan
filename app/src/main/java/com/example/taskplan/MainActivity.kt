package com.example.taskplan

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* criarBancoDados()
        inserindoDadosTemporarios()
        ListViewAnotacoes()*/


    }


    // public fun criarBancoDados () {
//
// try {
//
// //**** criando banco de dados ****
// val bancoDados = openOrCreateDatabase("DB_TaskPlan", MODE_PRIVATE, null)
//
// //**** criando uma tabela ****
// bancoDados.execSQL("CREATE TABLE IF NOT EXISTS conta(nome VARCHAR,email VARCHAR,nascimento INT(8),senha VARCHAR)")
// bancoDados.execSQL("CREATE TABLE IF NOT EXISTS tarefas(nome VARCHAR,tipo VARCHAR,prazo INT(8),hora INT(4))")
// bancoDados.execSQL("CREATE TABLE IF NOT EXISTS anotacoes(nome VARCHAR,texto VARCHAR,atribuicao VARCHAR)")
//
// //**** inserindo dados ****
// // bancoDados.execSQL("INSERT INTO cadastro(nome,email,nascimento,senha) VALUES('Pedrinho Caitano','pedrinhocaetano123@gmail.com',01012001,'senha')")
//
//
// //val consulta = "SELECT nome,email,nascimento,senha FROM cadastro"
//
// //val cursor = bancoDados.rawQuery(consulta,null)
//
// //**** consulta para saber se funfa ****
// //val indiceNome = cursor.getColumnIndex("nome")
// //val indiceEmail = cursor.getColumnIndex("email")
// //val indiceNascimento = cursor.getColumnIndex("nascimento")
// //val indiceSenha = cursor.getColumnIndex("senha")
// //cursor.moveToFirst()
//
// //while(cursor!= null){
//
// //   val nome = cursor.getString(indiceNome)
// //    val email = cursor.getString(indiceEmail)
// //    val nascimento = cursor.getString(indiceNascimento)
// //   val senha = cursor.getString(indiceSenha)
// //   Log.i("RESULTADO","/nome: $nome/ email: $email/ data de nascmento: $nascimento/ senha: $senha")
// //    cursor.moveToNext()
// //}
//
// bancoDados.close();
//
// }catch (e: Exception){
// e.printStackTrace()
// }
//
// }
//
// public fun ListViewAnotacoes () {
//
// try {
//
// val bancoDados = openOrCreateDatabase("DB_TaskPlan", MODE_PRIVATE, null)
// val cursor = bancoDados.rawQuery("SELECT nome FROM anotacoes", null)
// val linhas = ArrayList<String>()
// val meuAdapter: ArrayAdapter<String>
//
//
// cursor.moveToFirst()
// while (cursor != null) {
// linhas.add(cursor.getString(1))
// cursor.moveToNext()
// }
//
// }
//
// catch (e: Exception){
// e.printStackTrace()
// }
//
// }
//
// public fun inserindoDadosTemporarios(){
//
// try {
//
// val bancoDados = openOrCreateDatabase("DB_TaskPlan", MODE_PRIVATE, null)
// bancoDados.execSQL("INSERT INTO anotacoes(nome,texto,atribuicao) VALUES('teste','texto teste','teste')")
//
// bancoDados.close();
// }
// catch (e: Exception){
// e.printStackTrace()
// }
// }
//
    public fun BotaoSingin(View: View) {
        val ir_para_tela_Singin = Intent(this, TelaSingIn::class.java)
        startActivity(ir_para_tela_Singin)
//
    }

    public fun BotaoLogin(view: View) {
        val ir_para_tela_login = Intent(this, TelaLogin::class.java)
        startActivity(ir_para_tela_login)
//
    }
}