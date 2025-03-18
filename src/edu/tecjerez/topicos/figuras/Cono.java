package edu.tecjerez.topicos.figuras;

public class Cono {
    public double area(double radio, double generatriz) {
        return Math.PI * radio * (radio + generatriz);
    }

    public double volumen(double radio, double altura) {
        return (Math.PI * Math.pow(radio, 2) * altura) / 3;
    }
}