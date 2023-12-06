package com.example.taskplan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class criar_anotacoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_anotacoes)
    }
    public fun IrtelaAnotacoes(View: View) {
        val ir_para_tela_das_anotacoes= Intent(this,Notacoes_principal::class.java)
        startActivity(ir_para_tela_das_anotacoes)

    }
    public fun mInserir(View: View) {

        val etNomeAnot: EditText = findViewById(R.id.etNomeAnot)
        val etTextoAnot: EditText = findViewById(R.id.etTextoAnot)
        val etAtribuirAnot: EditText = findViewById(R.id.etAtribuirAnot)

        val anot = Anotacao(
            0,
            etNomeAnot.text.toString(),
            etTextoAnot.text.toString(),
            etAtribuirAnot.text.toString()
        )

        val AnotacaoDao = AnotacaoDao(this)
        val id = AnotacaoDao.inserir(anot)

        Toast.makeText(this, "anotacao salva, id: $id", Toast.LENGTH_LONG).show()
    }

}