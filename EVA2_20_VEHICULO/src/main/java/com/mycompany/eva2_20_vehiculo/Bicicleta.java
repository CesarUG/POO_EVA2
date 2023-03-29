/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_20_vehiculo;

/**
 *
 * @author Cesar
 */
public class Bicicleta extends Vehiculo implements ControlVelocidad {
    private String type;
  
    //Constructores

    public Bicicleta() {
        super();
        this.type ="-----";
        
    }

    public Bicicleta(String type, int velociadad, String brand, String model) {
        super(velociadad, brand, model);
        this.type = type;
    }
// get and set
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

  
//Métodos abstractos de ControlVelocidad
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
        System.out.println("velocidad: "+velocidad);    }
    
}
