/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_21_polimirfismo;

/**
 *
 * @author Cesar
 */
// Clase derivada EXTENSD CLASE BASE
// Subclase extends superclase
//hijo extends Padre

// Estudiante is a Persona
public class Estudiante extends Persona {
    private String numControl;

   public Estudiante(String numControl, String name, String lastName, int age) {
        super(name,lastName,age);//Llamada al constructor
  
        this.numControl = numControl;
    }
    public Estudiante(){
      super();
      this.numControl = "-----";
    }
    
    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
    //override reemplaza el método (con la misma firma) en la 
    // super clase, en este caso, reemplaza a imprimirDatos() de persona.
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();//PERSONA
        System.out.println("Número de control: "+getNumControl());
     
    }
}
