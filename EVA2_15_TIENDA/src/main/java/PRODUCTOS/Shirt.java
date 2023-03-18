/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRODUCTOS;
import SUPERCLASES.Ropa;
/**
 *
 * @author Cesar
 */
public class Shirt extends Ropa {
    private String size;
    private String type;

    public Shirt(String size, String type, String Brand, String color, double price, String name, String unit) {
        super(Brand, color, price, name, unit);
        this.size = size;
        this.type = type;
    }

    public Shirt() {
        super();
        this.size="-----";
        this.type="-----";
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

   @Override
    public double precioVenta(int cant) {
     
        if (cant<10)
            return getPrice()*cant;
        else
            return (getPrice()*.8)*cant;
    }
}
