/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_21_polimirfismo;

/**
 *
 * @author Cesar
 */
public class EVA2_21_POLIMIRFISMO {

    public static void main(String[] args) {
      Estudiante Student = new Estudiante();
      
       Student.setAge(18);
       Student.setName("Cesar");
       Student.setLastName("Urías Glez");
       Student.setNumControl("22550288");
       Student.imprimirDatos();
       Maestros maestro = new Maestros("D54D", "RUBEN", "No sé", 27);
       //PUEDO TRATAR A LAS OBJETOS DE LAS SUBCLASES COMO OBJETOS DE LA SUPER CLASE
       //Al revés no se puede
       
       //ESTOY ASIGANANDO UN OBJETO DE TIPO ESTUDIANTE A UNA  VARIABLE DE TIPO PERSONA
       Persona perso = Student;
       //Estoy generalizando(Simplificando)
       Persona perso2= maestro;
       Persona perso3 = new Persona();
       // Es imposible  convertir una persona en  un estudiante 
       // No  podemos  agregar cosas, simplemente ocultamos
       //Estudiante Student = perso3;
    }
}
