/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_7_this;

/**
 *
 * @author Cesar
 */
public class Persona {
   private String name;

    public Persona(String name) {
        this.name = name;
        // this.name es el atributo de la clase, name es la variable (parámetro) declarado en el método
        // this es una referencia a una instancia de la clase 
        //Todos los 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public void imprimirDatos(){
        System.out.println("El nombre es: "+this.name);
    }
}
