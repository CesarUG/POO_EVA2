/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_tipos_herencia;

/**
 *
 * @author Cesar
 */
public class EVA2_5_TIPOS_HERENCIA {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    class SuperClase{
    }
    class OtraSupeclase{// Ni se puede heredar de dos  o más SuperClases
        
    }       
    class ClaseBase extends SuperClase {//extends solo funciona para una unica clase
}
}
