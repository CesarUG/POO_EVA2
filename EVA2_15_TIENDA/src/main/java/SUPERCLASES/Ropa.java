/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUPERCLASES;

/**
 *
 * @author Cesar
 */
public abstract class Ropa extends PRODUCTO {
    private String Brand;
    private String color;

    public Ropa(String Brand, String color, double price, String name, String unit) {
        super(price, name, unit);
        this.Brand = Brand;
        this.color = color;
    }

    public Ropa() {
        super();
        this.color ="-----";
        this.color="-----";
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
    
    
}
