package model;

import java.sql.Date;

public class Autor {
    
    String nome;
    Date dataNasc;
    String nascionalidade;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    public String getNascionalidade() {
        return nascionalidade;
    }
    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }
    
}

