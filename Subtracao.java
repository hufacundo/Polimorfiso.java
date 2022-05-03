package br.uniesp.POO.polimorfismo;

public class Subtracao extends OperacaoMatematica {
    @Override
    public double calcular (double x, double y) {
        return x - y;
    }
}