package com.example.taskplan;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class AnotacaoDao {

    private Conexao con;
    private SQLiteDatabase db;


    public AnotacaoDao(Context context){
        con = new Conexao(context);
        db = con.getWritableDatabase();

    }


    public long inserir(Anotacao anotacao){
        ContentValues contentValues = new ContentValues();

        contentValues.put("nome", anotacao.getNome());
        contentValues.put("texto", anotacao.getTexto());
        contentValues.put("atribuicao", anotacao.getAtribuicao()); // Corrigido aqui

        return db.insert("anotacao", null, contentValues);

    }



    public List<Anotacao> listarAnotacoes() {

        List<Anotacao> listaAnotacao = new ArrayList<Anotacao>();
        Cursor cursor = db.rawQuery("SELECT * FROM anotacao", null);

        while (cursor.moveToNext()) {
            int id = cursor.getInt(0); // Assume que o ID está na coluna 0
            String nome = cursor.getString(1);
            String texto = cursor.getString(2);
            String atribuicao = cursor.getString(3);
            Log.d("AnotacaoDao", "ID: " + id + ", Nome: " + nome + ", Texto: " + texto + ", Atribuicao: " + atribuicao);
            listaAnotacao.add(new Anotacao(id, nome, texto, atribuicao));
        }

        return listaAnotacao;
    }
    public void excluir(int id) {
        try {
            Log.d("AnotacaoDao", "Excluir ID (antes da exclusão): " + id);
            db.delete("anotacao", "id=?", new String[]{String.valueOf(id)});
            Log.d("AnotacaoDao", "Registro excluído com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //**** tentativa de exclusao *****
    //public void excluir(Integer i) {
        //Toast.makeText(this, i.toString(), Toast.LENGTH_SHORT).show()
        //try{
          //  db = SQLiteDatabase.openOrCreateDatabase("anotacao", null);
          //  String sql = "DELETE FROM anotacao WHERE id =?";
          // SQLiteStatement stmt = db.compileStatement(sql);
           // stmt.bindLong(2,arrayIds.get(i));
           //stmt.executeUpdateDelete();
          // listarAnotacoes();


       // }catch(Exception e ){
         //   e.printStackTrace();
      // }
   // }


}
