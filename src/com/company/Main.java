package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Escriba 1 para calcular area y 2 para calcular perimetro");
        var perimetroArea = scn.nextInt();

        System.out.println("Escriba 1 para Circulo, 2 para Triangulo, 3 para Cuadrado y 4 para Rectangulo");

        var numero = scn.nextInt();
        if(perimetroArea == 1) {
            switch (numero) {
                case 1:
                    System.out.println("Escriba el radio del circulo");
                    var circulo = new Circulo();
                    System.out.println(CalcularAreaCirculo(circulo, scn));
                    break;
                case 2:
                    System.out.println("Escriba la base y la altura del triangulo");
                    var triangulo = new Triangulo();
                    System.out.println(CalcularAreaTriangulo(triangulo, scn));
                    break;
                case 3:
                    System.out.println("Escriba un lado del cuadrado");
                    var cuadrado = new Cuadrado();
                    System.out.println(CalcularAreaCuadrado(cuadrado, scn));
                    break;
                case 4:
                    System.out.println("Escriba los dos lados del rectangulo");
                    var rectangulo = new Rectangulo();
                    System.out.println(CalcularAreaRectangulo(rectangulo, scn));
                    break;
                default:
                    break;
            }
        }
        else{
            switch (numero) {
                case 1:
                    System.out.println("Escriba el radio del circulo");
                    var circulo = new Circulo();
                    System.out.println(CalcularPerimetroCirculo(circulo, scn));
                    break;
                case 2:
                    System.out.println("Escriba los dos lados y la base del triangulo");
                    var triangulo = new Triangulo();
                    System.out.println(CalcularPerimetroTriangulo(triangulo, scn));
                    break;
                case 3:
                    System.out.println("Escriba un lado del cuadrado");
                    var cuadrado = new Cuadrado();
                    System.out.println(CalcularPerimetroCuadrado(cuadrado, scn));
                    break;
                case 4:
                    System.out.println("Escriba los dos lados del rectangulo");
                    var rectangulo = new Rectangulo();
                    System.out.println(CalcularPerimetroRectangulo(rectangulo, scn));
                    break;
                default:
                    break;
            }
        }
    }

    public static float CalcularAreaCirculo(Circulo circulo, Scanner scn){
        var radio = scn.nextFloat();
        circulo = new Circulo(radio);
        return circulo.RetornarArea();
    }

    public static float CalcularAreaTriangulo(Triangulo triangulo, Scanner scn){
        var base = scn.nextFloat();
        var altura = scn.nextFloat();
        triangulo = new Triangulo(base, altura);

        return triangulo.RetornarArea();
    }

    public static float CalcularAreaCuadrado(Cuadrado cuadrado, Scanner scn){
        var lado = scn.nextFloat();
        cuadrado = new Cuadrado(lado);

        return cuadrado.RetornarArea();
    }

    public static float CalcularAreaRectangulo(Rectangulo rectangulo, Scanner scn){
        var lado1 = scn.nextFloat();
        var lado2 = scn.nextFloat();
        rectangulo = new Rectangulo(+lado1, lado2);

        return rectangulo.RetornarArea();
    }

    public static float CalcularPerimetroCirculo(Circulo circulo, Scanner scn){
        var radio = scn.nextFloat();
        circulo = new Circulo(radio);

        return circulo.RetornarPerimetro();
    }

    public static float CalcularPerimetroTriangulo(Triangulo triangulo, Scanner scn){
        var lado1 = scn.nextFloat();
        var lado2 = scn.nextFloat();
        var base = scn.nextFloat();
        triangulo = new Triangulo(lado1, lado2, base);

        return triangulo.RetornarPerimetro();
    }

    public static float CalcularPerimetroCuadrado(Cuadrado cuadrado, Scanner scn){
        var lado = scn.nextFloat();
        cuadrado = new Cuadrado(lado);

        return cuadrado.RetornarPerimetro();
    }

    public static float CalcularPerimetroRectangulo(Rectangulo rectangulo, Scanner scn){
        var lado1 = scn.nextFloat();
        var lado2 = scn.nextFloat();
        rectangulo = new Rectangulo(lado1, lado2);

        return rectangulo.RetornarPerimetro();
    }
}

