/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_extends;

/**
 *
 * @author Cesar
 */
public class EVA2_3_EXTENDS {

    public static void main(String[] args) {
      Estudiante alumno = new  Estudiante();
      alumno.setName("Cesar");
      alumno.setLastName("Urías González");
      alumno.setAge(18);
      alumno.setNumControl("45465135");
       System.out.println("Nombre: "+alumno.getName());
     System.out.println("Apellido: "+alumno.getLastName());
     System.out.println("Edad"+alumno.getAge());
     System.out.println("Nombre: "+alumno.getName());
     System.out.println("N° de control:"+alumno.getNumControl());
     
     //--------------------------------
     Proveedor prove_1 = new Proveedor();
     prove_1.setName("sdasd");
     prove_1.setLastName("sdadsad");
     prove_1.setAge(20);
     prove_1.setRfc("dsadadsa");
     
     System.out.println("Nombre: "+prove_1.getName());
     System.out.println("Apellido: "+prove_1.getLastName());
     System.out.println("Edad"+prove_1.getAge());
     System.out.println("Nombre: "+prove_1.getName());
     System.out.println("RFC:"+prove_1.getRfc());

     


        }
}