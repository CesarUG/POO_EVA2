/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_interfaces_figuras;

/**
 *
 * @author Cesar
 */
public class EVA2_19_INTERFACES_FIGURAS {

    public static void main(String[] args) {
        System.out.println("Circulo");
        Circulo circu1 = new Circulo(15);
        circu1.imprimirDatos();
        
        System.out.println("Triangulo");
        Triangulo trian1 = new Triangulo();
        trian1.setB(20);
        trian1.setH(20);
        trian1.imprimirDatos();
    
    }
}
