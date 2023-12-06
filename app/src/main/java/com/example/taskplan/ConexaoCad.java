package com.example.taskplan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;


public class ConexaoCad extends SQLiteOpenHelper {

    private  static final String nomeCad = "banco.db3";
    private  static final int versaoCad = 1;

    public ConexaoCad(Context context ) {
        super(context, nomeCad, null, versaoCad);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cadastros (idCad integer primary key autoincrement, nomeCad varchar(50),imail varchar(100),datanascimento varchar(10),senhacad varchar(50))");

    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int k, int k1) {

    }
    public Cadastros obterDadosConta() {
        SQLiteDatabase db = getReadableDatabase();
        String query = "SELECT * FROM cadastros LIMIT 1";
        Cursor cursor = db.rawQuery(query, null);

        if (cursor.moveToFirst()) {
            String nome = cursor.getString(cursor.getColumnIndex("nomeCad"));
            String email = cursor.getString(cursor.getColumnIndex("imail"));
            String dataNascimento = cursor.getString(cursor.getColumnIndex("datanascimento"));
            String senha = cursor.getString(cursor.getColumnIndex("senhacad"));

            return new Cadastros(nome, email, dataNascimento, senha);
        } else {
            return null;
        }
    }

}
