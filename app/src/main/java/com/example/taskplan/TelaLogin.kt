package com.example.taskplan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity





class TelaLogin : AppCompatActivity() {
    private lateinit var etEmailLogin: EditText
    private lateinit var etSenhaLogin: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        etEmailLogin = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        etSenhaLogin = findViewById<EditText>(R.id.editTextTextPassword2)
    }

    fun fazerLogin(view: View) {
        val email = etEmailLogin.text.toString()
        val senha = etSenhaLogin.text.toString()

        val cadastrosDAO = CadastrosDAO(this)

        if (cadastrosDAO.verificarLogin(email, senha)) {
            // Credenciais corretas, obter dados da conta
            val dadosConta = cadastrosDAO.obterDadosConta(email)

            // Passar dados para a tela_da_conta
            val irParaTelaConta = Intent(this, Tela_Principal::class.java)
            irParaTelaConta.putExtra("nomeCad", dadosConta.getnomeCad())
            irParaTelaConta.putExtra("imail", dadosConta.getImail())
            irParaTelaConta.putExtra("datanascimento", dadosConta.getDatanascimento())

            startActivity(irParaTelaConta)
        } else {
            // Credenciais incorretas, exibir mensagem de erro
            Toast.makeText(this, "Credenciais incorretas", Toast.LENGTH_SHORT).show()
        }
    }

    public fun BotaoSingin (View: View) {
        val ir_para_tela_Singin = Intent(this,TelaSingIn::class.java)
        startActivity(ir_para_tela_Singin)

    }
    //public fun IrtelaPrincipal(View:View) {
     //   val ir_para_tela_principal = Intent(this,Tela_Principal::class.java)
      //  startActivity(ir_para_tela_principal)

    //}
}