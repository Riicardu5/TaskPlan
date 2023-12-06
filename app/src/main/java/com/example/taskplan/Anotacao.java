package com.example.taskplan;

public class Anotacao {

    private int id;
    private String nome;
    private String texto;
    private String atribuicao;

    public Anotacao(int id, String nome, String texto, String atribuicao) {
        this.id = id;
        this.nome = nome;
        this.texto = texto;
        this.atribuicao = atribuicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAtribuicao() {
        return atribuicao;
    }

    public void setAtribuicao(String atribuicao) {
        this.atribuicao = atribuicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){

        return  nome + "      Atribuido a : " + atribuicao + "\n Texto:  " + texto;
    }
}
