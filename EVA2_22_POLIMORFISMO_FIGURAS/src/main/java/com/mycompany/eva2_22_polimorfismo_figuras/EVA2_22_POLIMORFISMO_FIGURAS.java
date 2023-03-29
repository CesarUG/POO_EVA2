/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_22_polimorfismo_figuras;
import java.util.Scanner;
/**
 *
 * @author Cesar
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {

    public static void main(String[] args){
            /*Circulo[] circulos = new Circulo[10];
            //un arreglo en java va de la posición 0 a la N-1
            // N es la cantidad de elementos del arreglo
            for(int i = 0; i<circulos.length; i++){
             circulos[i] = new Circulo(i); // Creamos cada uno de los objetos
             circulos[i].imprimirDatos();
            }*/
            
            Figuras []figuras;// Declaramos un arreglo, pero no lo hemos creado
            //Con escaner capturamos la cantidad de figuras a utilizar
            Scanner sc =  new Scanner(System.in);
            System.out.println("¿Cuántas figuras quieres?");
            int cant = sc.nextInt();// Nos permite capturar
            figuras = new Figuras[cant];//Creamos el arreglo con
                                        // con la cantidad que quiere el usuario
            for (int i = 0; i < cant; i++) {
                System.out.println("Captura el tipo de figura");
                System.out.println("1. Circulo, 2. Triángulo");
                int figu = sc.nextInt();
                if( figu == 1){//Circulo
                    Circulo circu = new Circulo();
                    System.out.println("Introduce el radio: ");
                    circu.setRadio(sc.nextInt());
                    
                figuras[i] = circu;
                }else{//Triángulo5
                    
                    Triangulo trian= new Triangulo();
                    System.out.println("Introduce la base: ");
                    trian.setB(sc.nextDouble());
                    System.out.println("Introduce la base: ");
                    trian.setH(sc.nextDouble());
                    figuras[i] = trian;
                }
            
        }
            
           for (int i = 0;i<figuras.length; i++){
               if(figuras[i] instanceof Circulo){
               Circulo circu = (Circulo)figuras[i];//Casting
               circu.imprimirDatos();
               }else{             
                   Triangulo trian = (Triangulo)figuras[i];
                   trian.imprimirDatos();
           }
               
           }
                    
    }
}
