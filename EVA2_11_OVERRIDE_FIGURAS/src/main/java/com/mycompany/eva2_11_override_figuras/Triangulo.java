/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_11_override_figuras;

/**
 *
 * @author Cesar
 */
public class Triangulo extends Figura{
    private double b;
    private double h;

    public Triangulo() {
        this.b=0;
        this.h=0;
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
    public double calcularArea(){
        return (b*h)/2;
    }
    @Override
    public double calcularPeri(){
        return b=b+b+b;
    }
}
