package com.example.taskplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TelaLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)
    }

    public fun BotaoSingin (View: View) {
        val ir_para_tela_Singin = Intent(this,TelaSingIn::class.java)
        startActivity(ir_para_tela_Singin)

    }
    public fun IrtelaPrincipal(View:View) {
        val ir_para_tela_principal = Intent(this,Tela_Principal::class.java)
        startActivity(ir_para_tela_principal)

    }
}