package com.example.taskplan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TelaSingIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_sing_in)

    }

    public fun BotaoLogin (view: View) {
        val ir_para_tela_login = Intent(this,TelaLogin::class.java)
        startActivity(ir_para_tela_login)

    }
   public fun IrtelaPrincipal(View:View) {
       val ir_para_tela_principal = Intent(this,Tela_Principal::class.java)
       startActivity(ir_para_tela_principal)

   }
    public fun mInserirCadas(View: View){

        val etNomeCad: EditText = findViewById(R.id.etNomeCad)
        val etEmailCad: EditText = findViewById(R.id.etEmailCad)
        val etNascimentoCad: EditText = findViewById(R.id.etNascimentoCad)
        val etSenhaCad: EditText = findViewById(R.id.etSenhaCad)

        val cadastros = Cadastros(
            etNomeCad.text.toString(),
            etEmailCad.text.toString(),
            etNascimentoCad.text.toString(),
            etSenhaCad.text.toString(),
            //etAtribuirAnot.text.toString(),
        )

        val CadastrosDAO = CadastrosDAO(this)
        val id = CadastrosDAO.inserircad(cadastros)

        Toast.makeText(this, "cadastro salvo, id: $id", Toast.LENGTH_LONG).show()
    }

}