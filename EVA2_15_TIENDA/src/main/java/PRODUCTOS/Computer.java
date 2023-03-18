/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRODUCTOS;

import SUPERCLASES.Electronica;

/**
 *
 * @author Cesar
 */
public class Computer extends Electronica{
    private double Size;
    private int Ram;
    private String Processor;
    private String DD;

    public Computer(double Size, int Ram, String Processor, String DD, String Manufacturer, int Garantia, String model, double price, String name, String unit) {
        super(Manufacturer, Garantia, model, price, name, unit);
        this.Size = Size;
        this.Ram = Ram;
        this.Processor = Processor;
        this.DD = DD;
    }

    public Computer() {
        super();
        this.DD="-----";
        this.Processor="-----";
        this. Size=0;
        this.Ram=0;
        
    }

    public double getSize() {
        return Size;
    }

    public void setSize(double Size) {
        this.Size = Size;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int Ram) {
        this.Ram = Ram;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    public String getDD() {
        return DD;
    }

    public void setDD(String DD) {
        this.DD = DD;
    }

    
    @Override
    public double precioVenta(int cant) {
     
        if (cant<10)
            return getPrice()*cant;
        else
            return (getPrice()*.8)*cant;
    }
    
    
}
