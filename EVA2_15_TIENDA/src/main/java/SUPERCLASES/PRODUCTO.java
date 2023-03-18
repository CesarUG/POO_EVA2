/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUPERCLASES;

/**
 *
 * @author Cesar
 */
public abstract class PRODUCTO {
    private double price;
    private String name;
    private String unit;// unidad de memedida piezas, kilos, docenas

    public PRODUCTO(double price, String name, String unit) {
        this.price = price;
        this.name = name;
        this.unit = unit;
    }

    public PRODUCTO() {
        this.price = 0;
        this.name ="-----";
        this.unit="-----";
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public abstract double precioVenta(int cant);
    
   
}
