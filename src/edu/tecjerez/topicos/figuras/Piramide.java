package edu.tecjerez.topicos.figuras;

public class Piramide {
    public double area(double base, double altura) {
        return (base * base) + (2 * base * altura);
    }

    public double volumen(double base, double altura) {
        return (base * base * altura) / 3;
    }
}