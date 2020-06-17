package com.company;

public class Circulo {
    public float Radio;

    public Circulo (float radio){
        Radio = radio;
    }

    public Circulo(){}

    public float RetornarPerimetro(){
        return (float)(2 * Radio * Math.PI);
    }

    public float RetornarArea(){ return (float)(Math.PI * Radio * Radio); }
}
