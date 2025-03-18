package edu.tecjerez.topicos.figuras;

public class Elipse {
    public double area(double ejeMayor, double ejeMenor) {
        return Math.PI * ejeMayor * ejeMenor;
    }

    public double perimetro(double ejeMayor, double ejeMenor) {
        return Math.PI * (3 * (ejeMayor + ejeMenor) - Math.sqrt((3 * ejeMayor + ejeMenor) * (ejeMayor + 3 * ejeMenor)));
    }
}