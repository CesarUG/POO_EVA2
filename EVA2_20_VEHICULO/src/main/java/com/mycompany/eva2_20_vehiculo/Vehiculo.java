/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_20_vehiculo;

/**
 *
 * @author Cesar
 */
public abstract class Vehiculo  {
    protected int velocidad;
    protected String brand;
    protected String model;
    
    public Vehiculo() {
        this.velocidad=0;
        this.brand = "----";
        this.model = "----";
    }
    
    public Vehiculo(int velocidad, String brand,String model) {
        this.velocidad = velocidad;
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setModel(String model){
    this.model = model;
    }
  
    public String getModel(){
        return model;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public int getVelociadad() {
        return velocidad;
    }

    
    
}
