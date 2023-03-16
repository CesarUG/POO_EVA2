/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_herencia;

/**
 *
 * @author Cesar
 */
public class Provedores {
    private String name;
    private String lastName;
    private int age;
    private String razonSocial;
    private String rfc;

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

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Provedores(String name, String lastName, int age, String razonSocial, String rfc) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.razonSocial = razonSocial;
        this.rfc = rfc;
    }

    public Provedores() {
    }
    
    
    
}
