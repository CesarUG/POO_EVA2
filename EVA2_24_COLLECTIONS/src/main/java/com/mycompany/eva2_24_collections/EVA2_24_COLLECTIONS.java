/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_24_collections;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public class EVA2_24_COLLECTIONS {

    public static void main(String[] args) {
        ArrayList  miarreglo = new ArrayList();
        miarreglo.add(new Persona());
        miarreglo.add(new Perro());
        miarreglo.add(new Automovil());
        
        
        ArrayList<Integer> miArreglo2 = new ArrayList<Integer>();
        miArreglo2.add(100);
        miArreglo2.add(200);
        miArreglo2.add(300);
        miArreglo2.add(400); 
        System.out.println(miArreglo2);
    }
}

 class Persona{
 }

class Perro{
}

class Automovil{
}