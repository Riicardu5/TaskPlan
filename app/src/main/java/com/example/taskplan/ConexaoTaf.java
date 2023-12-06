package com.example.taskplan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexaoTaf extends SQLiteOpenHelper {

    private  static final String nomeTaf = "banco.db2";
    private  static final int versaoTaf = 1;

    public ConexaoTaf(Context context ) {
        super(context, nomeTaf, null, versaoTaf);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE tarefas (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nomeTaf TEXT," +
                "tipoTaf TEXT," +
                "dia TEXT," +
                "horario TEXT)";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int j, int j1) {

    }
}
