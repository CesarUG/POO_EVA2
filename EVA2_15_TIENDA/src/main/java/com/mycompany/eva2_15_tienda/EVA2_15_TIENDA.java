/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_15_tienda;

/**
 *
 * @author Cesar
 */
import PRODUCTOS.Computer;
import PRODUCTOS.Shirt;

public class EVA2_15_TIENDA {

    public static void main(String[] args) {
       Computer laptop = new Computer(11.6, 16, "Intel Corei5", "1 TB", "LENOVO", 21, "Thinkpad", 250, "Laptop", "Piezas");
        laptop.precioVenta(10);
       Shirt shirt1 = new Shirt();
      
    }
}
