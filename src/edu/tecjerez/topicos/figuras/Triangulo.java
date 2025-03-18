package edu.tecjerez.topicos.figuras;

public class Triangulo {
    public double area(double base, double altura) {
        return (base * altura) / 2;
    }

    public double perimetro(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
}