package com.example.taskplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

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
}