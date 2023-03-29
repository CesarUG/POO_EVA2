/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_20_vehiculo;

/**
 *
 * @author Cesar
 */
public class Automovil extends Vehiculo implements  ControlVelocidad {
    private String motor;
    private String placas;

    public Automovil(String motor, String placas, int velocidad, String brand, String model) {
        super(velocidad, brand, model);
        this.motor = motor;
        this.placas = placas;
    }

    public Automovil() {
       super();
       this.motor = "----";
       this.placas= "----";
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }
    

    @Override
    public int acelerar() {
    if(velocidad<200)
           velocidad++;
       return velocidad;
    }

    @Override
    public int detener() {
        if(velocidad>0)
           velocidad--;
       return velocidad;
    }

    @Override
    public void imprimirVel() {
        System.out.println("Velocidad: "+velocidad);
    }
    
    
    
    
}
