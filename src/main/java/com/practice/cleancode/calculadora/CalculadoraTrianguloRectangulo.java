package com.practice.cleancode.calculadora;

public class CalculadoraTrianguloRectangulo {

    public Double calcularArea(Double hipotenusa, Double cateto) {
        Double catetoAdyacente = Math.sqrt(hipotenusa * hipotenusa - cateto * cateto);

        return cateto * catetoAdyacente / 2;
    }
}
