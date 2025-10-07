package com.example.myapplication;

public class Aluno {
    String nomeAt;

    String cursoAt;
    public Aluno(String namePar, String coursePar){
        this.nomeAt = namePar;
        this.cursoAt = coursePar;
    }
    public String getNome(){
        return nomeAt;
    }
    public String getCurso(){
        return cursoAt;
    }
}
