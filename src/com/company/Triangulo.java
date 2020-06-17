package com.company;

public class Triangulo {
    public float Base;
    public float Altura;
    public float Lado1;
    public float Lado2;

    public Triangulo(float base, float altura){
        Base = base;
        Altura = altura;
    }

    public Triangulo() {}

    public Triangulo(float lado1, float lado2, float base){
        Base = base;
        Lado1 = lado1;
        Lado2 = lado2;
    }

    public float RetornarPerimetro(){
        return Base + Lado1 + Lado2;
    }
    public float RetornarArea(){
        return (float)((Base * Altura) / 2);
    }
}
