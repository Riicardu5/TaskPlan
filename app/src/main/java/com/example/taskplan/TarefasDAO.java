package com.example.taskplan;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class TarefasDAO {

    private ConexaoTaf cont;
    private SQLiteDatabase dbt;

    public TarefasDAO(Context context){
        cont = new ConexaoTaf(context);
        dbt = cont.getWritableDatabase();

    }

    public long inserirTaf(Tarefas tarefas) {
        ContentValues contentValues = new ContentValues();

        contentValues.put("nomeTaf", tarefas.getNomeTaf());
        contentValues.put("tipoTaf", tarefas.getTipoTaf());
        contentValues.put("dia", tarefas.getDia());
        contentValues.put("horario", tarefas.getHorario());

        long id = dbt.insert("tarefas", null, contentValues);
        tarefas.setId(id);  // Atualize o ID da tarefa após a inserção

        return id;
    }
    public List<Tarefas> listarTarefas() {
        List<Tarefas> listaTarefas = new ArrayList<>();

        Cursor cursor = dbt.rawQuery("SELECT * FROM tarefas", null);

        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String nomeTaf = cursor.getString(cursor.getColumnIndex("nomeTaf"));
            String tipoTaf = cursor.getString(cursor.getColumnIndex("tipoTaf"));
            String dia = cursor.getString(cursor.getColumnIndex("dia"));
            String horario = cursor.getString(cursor.getColumnIndex("horario"));

            Tarefas tarefa = new Tarefas(id, nomeTaf, tipoTaf, dia, horario);
            listaTarefas.add(tarefa);
        }

        cursor.close();
        return listaTarefas;
    }

    public void excluir(long id) {
        try {
            Log.d("TarefasDAO", "Excluir ID (antes da exclusão): " + id);
            int rowsDeleted = dbt.delete("tarefas", "id=?", new String[]{String.valueOf(id)});
            Log.d("TarefasDAO", "Número de registros excluídos: " + rowsDeleted);
            Log.d("TarefasDAO", "Registro excluído com sucesso");
        } catch (Exception e) {
            Log.e("TarefasDAO", "Erro ao excluir registro", e);
        }
    }


}
