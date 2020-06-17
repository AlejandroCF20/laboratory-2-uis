package com.company;

public class Cuadrado {
    public float Lado;

    public Cuadrado(float lado){
        Lado = lado;
    }

    public Cuadrado () {}

    public float RetornarPerimetro(){
        return (float)(Lado * 4);
    }

    public float RetornarArea(){
        return (float)(Lado * Lado);
    }
}
