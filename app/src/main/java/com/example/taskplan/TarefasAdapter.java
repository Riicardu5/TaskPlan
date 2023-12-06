package com.example.taskplan;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class TarefasAdapter extends ArrayAdapter<Tarefas> {

    public TarefasAdapter(Context context, List<Tarefas> tarefas) {
        super(context, android.R.layout.simple_list_item_1, tarefas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        TextView textView = view.findViewById(android.R.id.text1);

        Tarefas tarefa = getItem(position);

        // Defina a cor com base no valor de tipoTaf
        if (tarefa != null) {
            String tipoTaf = tarefa.getTipoTaf();
            int cor = Color.BLACK; // Cor padrão

            if ("1".equals(tipoTaf)) {
                cor = Color.RED; // Vermelho
            } else if ("2".equals(tipoTaf)) {
                cor = Color.YELLOW; // Amarelo
            } else if ("3".equals(tipoTaf)) {
                cor = Color.GREEN; // Verde
            }

            textView.setTextColor(cor);
        }

        return view;
    }
}

