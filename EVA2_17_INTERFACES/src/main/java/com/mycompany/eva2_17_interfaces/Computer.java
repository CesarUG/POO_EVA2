/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_17_interfaces;

/**
 *
 * @author Cesar
 */
public class Computer extends Producto implements MostrarDatos{
    private String procesador;
    private int ram;

    public Computer() {
        super();
    }

    public Computer(String procesador, int ram, double price, String name) {
        super(price, name);
        this.procesador = procesador;
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+getName());
        System.out.println("Precio: "+getPrice());
        System.out.println("Procesador: "+getProcesador());
        System.out.println("Ram: "+getRam());
    }
    
}
