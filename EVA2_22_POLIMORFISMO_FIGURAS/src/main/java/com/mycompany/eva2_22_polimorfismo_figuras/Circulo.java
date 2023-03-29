/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_22_polimorfismo_figuras;

/**
 *
 * @author Cesar
 */
public class Circulo implements Figuras, ImprimirDatos {
    private double  radio;
    public Circulo() {
        this.radio = 0;
    }
    public Circulo(int radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*(Math.pow(radio, 2));
    }

    @Override
    public double calcularPeri() {
        return Math.PI*(radio*2);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Circulo");
        System.out.println("Radio: "+radio);
        System.out.println("Área: "+calcularArea());
        System.out.println("Perímetro: "+calcularPeri());
    }
}
