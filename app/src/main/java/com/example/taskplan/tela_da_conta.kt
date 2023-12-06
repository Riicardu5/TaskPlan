package com.example.taskplan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class tela_da_conta : AppCompatActivity() {

    private lateinit var nomeTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var dataNascimentoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_da_conta)

        // Inicialize os TextViews
        nomeTextView = findViewById(R.id.exemplonome)
        emailTextView = findViewById(R.id.exemploemail)
        dataNascimentoTextView = findViewById(R.id.exemplodata)

        // Recupere os dados do usuário do banco de dados
        val conexaoCad = ConexaoCad(this)
        val cadastro = conexaoCad.obterDadosConta()

        // Verifique se o cadastro não é nulo antes de definir os textos
        if (cadastro != null) {
            nomeTextView.text = cadastro.getnomeCad()
            emailTextView.text = cadastro.getImail()
            dataNascimentoTextView.text = cadastro.getDatanascimento()
        }

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