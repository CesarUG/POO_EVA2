/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_super_2;

/**
 *
 * @author Cesar
 */
public class EVA2_9_SUPER_2 {

    public static void main(String[] args) {
        Estudiante student = new Estudiante("2564521654","César","Urías",18);
        student.imprimirDatos();
        
        
        //Maestros
        Maestros teacher = new Maestros("55DSD554", "Juan", "Algo", 25);
        teacher.imprimirDatos();
        
        
        //Proveedor
        Proveedor supplier = new Proveedor();
        supplier.imprimirDatos();
        
    }
}
