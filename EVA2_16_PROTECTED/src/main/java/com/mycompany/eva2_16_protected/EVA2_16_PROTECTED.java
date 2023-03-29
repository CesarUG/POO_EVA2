/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_16_protected;

/**
 *
 * @author Cesar
 */
public class EVA2_16_PROTECTED {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SuperClase objClase= new SuperClase();
        objClase.dato = 100;
    }
}

class SuperClase{
  protected int dato;

   
}
class subClase extends SuperClase{
 public void imprimirDato(){
     System.out.println("Dato"+dato);
 }
}