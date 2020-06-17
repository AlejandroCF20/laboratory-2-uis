package com.company;

public class Rectangulo {
        public float Lado1;
        public float Lado2;

        public Rectangulo(float lado1, float lado2){
            Lado1 = lado1;
            Lado2 = lado2;
        }

        public Rectangulo() {}

        public float RetornarPerimetro(){
            return Lado1 * 2 + Lado2 * 2;
        }

        public float RetornarArea(){
            return Lado1 * Lado2;
        }

}
