/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_herencia;

/**
 *
 * @author Cesar
 */
public class Estudiante {
    private String name;
    private String lastName;
    private int age;
    private String NumControl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumControl() {
        return NumControl;
    }

    public void setNumControl(String NumControl) {
        this.NumControl = NumControl;
    }
    //CONTRUCTORES

    public Estudiante() {
    }

    public Estudiante(String name, String lastName, int age, String NumControl) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.NumControl = NumControl;
    }
    

}
