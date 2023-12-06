package com.example.taskplan;

public class Cadastros {

    private String nomeCad;
    private String imail;
    private String datanascimento;
    private String senhacad;

    public Cadastros(String nomeTaf, String imail, String datanascimento, String senhacad) {
        this.nomeCad = nomeTaf;
        this.imail = imail;
        this.datanascimento = datanascimento;
        this.senhacad = senhacad;
    }

    public String getnomeCad() {
        return nomeCad;
    }

    public void setNomeTaf(String nomeCad) {
        this.nomeCad = nomeCad;
    }

    public String getImail() {
        return imail;
    }

    public void setImail(String imail) {
        this.imail = imail;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getSenhacad() {
        return senhacad;
    }

    public void setSenhacad(String senhacad) {
        this.senhacad = senhacad;
    }
}



