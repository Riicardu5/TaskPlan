package com.example.taskplan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Conexao extends SQLiteOpenHelper {


    private  static final String nome = "banco.db";
    private  static final int versao = 1;

    public Conexao(Context context ) {
            super(context, nome, null, versao);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.d("Conexao", "onCreate chamado");
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS anotacao (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, texto TEXT, atribuicao TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
