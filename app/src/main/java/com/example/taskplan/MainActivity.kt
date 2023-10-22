package com.example.taskplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun BotaoSingin (View: View) {
        val ir_para_tela_Singin = Intent(this,TelaSingIn::class.java)
        startActivity(ir_para_tela_Singin)

    }
    public fun BotaoLogin (view: View) {
        val ir_para_tela_login = Intent(this,TelaLogin::class.java)
        startActivity(ir_para_tela_login)

    }


}