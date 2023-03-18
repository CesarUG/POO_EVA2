/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_override_figuras;

/**
 *
 * @author Cesar
 */
public class EVA2_11_OVERRIDE_FIGURAS {

    public static void main(String[] args) {
        Circulo circu1 = new Circulo(10);
        System.out.println("Área: "+circu1.calcularArea());
        System.out.println("Perímetro: "+circu1.calcularPeri());
        Triangulo trian1 = new Triangulo(2,4);
        System.out.println("Área: "+trian1.calcularArea());
        System.out.println("Perímetro: "+trian1.calcularArea());
    }
}
