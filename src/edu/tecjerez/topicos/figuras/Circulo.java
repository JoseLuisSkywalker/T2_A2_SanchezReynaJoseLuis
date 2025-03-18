package edu.tecjerez.topicos.figuras;

public class Circulo {
    public double area(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}