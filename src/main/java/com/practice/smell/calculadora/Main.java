package com.practice.smell.calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("Resultado: " + c.calcular(5.0,4.0));

        Calculadora d = new Calculadora();
        System.out.println("Resultado: " + d.calcular(10.0,8.0));
    }
}