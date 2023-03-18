/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_14_clases_abstractas2;

/**
 *
 * @author Cesar
 */
public abstract class Persona {
    private String name;
    private int age;
    //Constructores

    public Persona() {
    }

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    
    //get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    //LOS MÉTODOS ABSTRACTOS  PUEDEN COEXISTIR  CON MÉTODOS NORMALES
    public abstract void imprimirDatos();
    
}
