package com.example.myapplication;

public class Funcionarios {

    float remuneracaoAt;
    String cargoAt;

    public Funcionarios(float r, String c){
      this.cargoAt = c;
      this.remuneracaoAt = r;
    }
    public Funcionarios(){
    }

    public void setCargo(String car){
        this.cargoAt = car;
    }
    public void setRemuneracao(float rem){
        this.remuneracaoAt = rem;
    }

    public String getCargo(){
        return cargoAt;
    }

    public float getRemuneracao(){
        return remuneracaoAt;
    }

}
