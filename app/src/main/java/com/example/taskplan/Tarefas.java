package com.example.taskplan;

public class Tarefas {

    private long id;
    private String nomeTaf;
    private String tipoTaf;
    private String dia;
    private String horario;

    public Tarefas(long id, String nomeTaf, String tipoTaf, String dia, String horario) {
        this.id = id;
        this.nomeTaf = nomeTaf;
        this.tipoTaf = tipoTaf;
        this.dia = dia;
        this.horario = horario;
    }

    // restante do código...


    public String getNomeTaf() {
        return nomeTaf;
    }

    public void setNomeTaf(String nomeTaf) {
        this.nomeTaf = nomeTaf;
    }

    public String getTipoTaf() {
        return tipoTaf;
    }

    public void setTipoTaf(String tipoTaf) {
        this.tipoTaf = tipoTaf;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString(){

        return  nomeTaf + "      Tipo: " + tipoTaf + "\n Data:  " + dia + " hora: " + horario;
    }
}
