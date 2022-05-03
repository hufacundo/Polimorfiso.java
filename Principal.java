package br.uniesp.POO.polimorfismo;

public class Principal {
    public static void calcularOperacao(OperacaoMatematica o, double x, double y){
        System.out.println(o.calcular(x,y));
    }

    public static void main(String[] args){
        calcularOperacao(new Soma(), 10, 850);
        calcularOperacao(new Multiplicacao(), 15, 25);
        calcularOperacao(new Subtracao(), 35, 120);
        calcularOperacao(new Divisao(), 240, 23);
    }
}
