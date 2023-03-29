/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_vehiculo;

/**
 *
 * @author Cesar
 */
public class EVA2_20_VEHICULO {

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta("Montaña", 0, "Argon", "Argon 18");
        
        bici.acelerar();
        bici.imprimirVel();
        bici.detener();
        bici.imprimirVel();
        
        System.out.println("Auto");
        Automovil auto = new Automovil();
        auto.setBrand("BMW");
        auto.setModel("X5");
        auto.setMotor("V6");
        auto.acelerar();
        auto.imprimirVel();
        
        
    }
}
