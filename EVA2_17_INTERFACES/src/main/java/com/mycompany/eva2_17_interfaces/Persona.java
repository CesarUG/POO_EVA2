/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_17_interfaces;

/**
 *
 * @author Cesar
 */
public class Persona implements MostrarDatos {
    private String name;
    private int edad;

    public Persona() {
    }

    public Persona(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *Imprimir datos
     */
    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+name);
        System.out.println("Edad: "+ edad);
    }
    
    
    
    
}
