/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_override;

/**
 *
 * @author Cesar
 */
public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
       Persona perso1 = new Persona();
       Persona perso2 = new Persona("Luis", 10);
        
        System.out.println(perso1);
        System.out.println(perso2);

    }
}
 class Persona{
 private String name;
 private int age;

    public Persona() {
        this.age=0;
        this.name="----";
    }

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
    
 @Override
    public String toString(){
        // NO ESTAMOS INVOCANDO AL MÉTODO SOBREESCRITO DE LA SUPER CLASE
        // AQUÍ ESTAMOS REEMPLAZANDO TOTALMENTE A toString DE LA SUPER CLASE
     String cade = "Datos: \n"+
                   "Nombre: "+ name + "\n"+
                   "Edad: "+ age;
     return cade;
    }
    
 
 }