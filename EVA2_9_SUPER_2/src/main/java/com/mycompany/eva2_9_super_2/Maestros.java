/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_super_2;

/**
 *
 * @author Cesar
 */
//Maestro is a Persona
public class Maestros extends Persona {
    private String plaza;
    //Constructor
    public Maestros(){
        super();
        this.plaza="-----";
    }
    
    public Maestros(String plaza, String name, String lastName, int age ){
       super(name,lastName,age);
       this.plaza=plaza;
    }
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Plaza: "+getPlaza());
    }
}
