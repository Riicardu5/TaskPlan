package com.example.taskplan;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.util.Log;




public class CadastrosDAO {

    private ConexaoCad conc;
    private SQLiteDatabase dbc;

    public CadastrosDAO(Context context){
        conc = new ConexaoCad(context);
        dbc = conc.getWritableDatabase();


    }

    public long inserircad(Cadastros cadastros){

        ContentValues contentValues = new ContentValues();

        contentValues.put("nomeCad", cadastros.getnomeCad());
        contentValues.put("imail", cadastros.getImail());
        contentValues.put("datanascimento", cadastros.getDatanascimento());
        contentValues.put("senhacad", cadastros.getSenhacad());

        return dbc.insert("cadastros",null,contentValues);
    }
    public boolean verificarLogin(String email, String senha) {
        String[] columns = {"idCad"};
        SQLiteDatabase db = conc.getReadableDatabase();
        String selection = "imail = ? AND senhacad = ?";
        String[] selectionArgs = {email, senha};

        Cursor cursor = db.query("cadastros", columns, selection, selectionArgs, null, null, null);

        int count = cursor.getCount();

        // Adicione este log para imprimir o número de colunas no cursor
        Log.d("VerificarLogin", "Número de colunas no cursor: " + cursor.getColumnCount());

        cursor.close();

        if (count > 0) {
            // Log para verificar se está entrando quando o login é bem-sucedido
            Log.d("VerificarLogin", "Login bem-sucedido para: $email");
        } else {
            // Log para verificar se está entrando quando o login falha
            Log.d("VerificarLogin", "Login falhou para: $email");
        }

        return count > 0;
    }
    public Cadastros obterDadosConta(String email) {
        String[] columns = {"nomeCad", "imail", "datanascimento"};
        SQLiteDatabase db = conc.getReadableDatabase();
        String selection = "imail = ?";
        String[] selectionArgs = {email};

        Cursor cursor = db.query("cadastros", columns, selection, selectionArgs, null, null, null);

        // Adicione este log para imprimir o número de colunas no cursor
        Log.d("ObterDadosConta", "Número de colunas no cursor: " + cursor.getColumnCount());

        Cadastros dadosConta = null;

        if (cursor.moveToFirst()) {
            String nomeCad = cursor.getString(cursor.getColumnIndex("nomeCad"));
            String imail = cursor.getString(cursor.getColumnIndex("imail"));
            String datanascimento = cursor.getString(cursor.getColumnIndex("datanascimento"));

            dadosConta = new Cadastros(nomeCad, imail, datanascimento, ""); // Note que a senha é deixada vazia
        }

        cursor.close();
        return dadosConta;
    }
}

