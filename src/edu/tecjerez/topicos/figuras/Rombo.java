package edu.tecjerez.topicos.figuras;

public class Rombo {
    public double area(double diagonalMayor, double diagonalMenor) {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public double perimetro(double lado) {
        return 4 * lado;
    }
}