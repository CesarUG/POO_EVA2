/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_super_2;

/**
 *
 * @author Cesar
 */
// proveedore is a Persona
public class Proveedor extends Persona {
    private String rfc;
    public Proveedor(String rfc, String name, String lastName, int age){
      super(name,lastName,age);
      this.rfc=rfc;
    }
    public Proveedor(){
     super();
     this.rfc="-----";
    }
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RFC: "+getRfc());
    }
}
