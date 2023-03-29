/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_19_interfaces_figuras;

/**
 *
 * @author Cesar
 */
public class Triangulo implements Figuras, ImprimirDatos{
    private double b;
    private double h;
    public Triangulo() {
        this.b = 0;
        this.h = 0;
    }
    public Triangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return (b*h)/2;
    }

    @Override
    public double calcularPeri() {
        return b+h+(Math.hypot(b, h));
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Circulo");
        System.out.println("Base: "+b);
        System.out.println("Altura: "+h);
        System.out.println("Área: "+calcularArea());
        System.out.println("Perímetro: "+calcularPeri());
    }
    
    
}
