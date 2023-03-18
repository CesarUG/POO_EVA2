/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUPERCLASES;

/**
 *
 * @author Cesar
 */
public abstract class Electronica extends PRODUCTO {
    private String Manufacturer;
    private int Garantia;
    private String model;

    public Electronica(String Manufacturer, int Garantia, String model, double price, String name, String unit) {
        super(price, name, unit);
        this.Manufacturer = Manufacturer;
        this.Garantia = Garantia;
        this.model = model;
    }

    public Electronica() {
        super();
        this.Garantia=0;
        this.Manufacturer="-----";
        this.model="-----";
        
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public int getGarantia() {
        return Garantia;
    }

    public void setGarantia(int Garantia) {
        this.Garantia = Garantia;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
    
}
