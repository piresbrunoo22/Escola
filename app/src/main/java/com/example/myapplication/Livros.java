package com.example.myapplication;

public class Livros {
    String tituloAt;
    String subtituloAt;

    public Livros(String sub, String ti){
        this.tituloAt = ti;
        this.subtituloAt = sub;
    }
    public Livros(){
    }

    public void setCargo(String tit){
        this.tituloAt = tit;
    }
    public void setSubtitulo(String subt){
        this.subtituloAt = subt;
    }

    public String getTitulo(){
        return tituloAt;
    }

    public String getSubtitulo(){
        return subtituloAt;
    }
}
