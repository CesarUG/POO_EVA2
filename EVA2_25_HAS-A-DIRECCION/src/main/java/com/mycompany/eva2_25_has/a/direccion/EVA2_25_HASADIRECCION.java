/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_25_has.a.direccion;

/**
 *
 * @author Cesar
 */
public class EVA2_25_HASADIRECCION {

    public static void main(String[] args) {
        Personas perso = new Personas();
        perso.setName("Juan");
        perso.setLastName("Herrera");
        perso.setAge(18);
        //Para asignar dirección tenemos qe crear un objeto
        direction  direccion = new direction();
        direccion.setCalle("Industrias");
        direccion.setNumero(11101);
        direccion.setColonia("Complejo industrial Chihuahua");
        direccion.setCp("31135");
        direccion.setCiudad("Chihuahua");
        direccion.setEstado("Chihuahua");
        perso.setDirección(direccion);
        
        perso.imprimirDatos();
    }
}


class direction{
  private String calle;
  private int numero;
  private String colonia;
  private String cp;
  private String ciudad;
  private String estado;

    public direction() {
        this.calle ="-----";
        this.ciudad="-----";
        this.colonia="-----";
        this.cp="-----";
        this.estado="-----";
        this.numero=0;
    }

    public direction(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
  public void imprimirDatos(){
      System.out.println("Dirección");
      System.out.println(calle+"#"+numero+", "+ colonia+"\n C.p."+cp+", "+ciudad+", "+estado); 
                          
  }
}

class Personas {
  private String name;
  private String LastName;
  private int age;
  private direction direccion;// Has a (tiene una) dirección

    public Personas() {
        this.LastName="----";
        this.name="----";
        this.age=0;
        this.direccion= null;//No existe el objeto dirección
    }

    public Personas(String name, String LastName, int age, direction direccion) {
        this.name = name;
        this.LastName = LastName;
        this.age = age;
        this.direccion = direccion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public direction getDireccion() {
        return direccion;
    }

    public void setDirección(direction dirección) {
        this.direccion = dirección;
    }
  
    public void imprimirDatos(){
        System.out.println("Persona");
        System.out.println(name+" "+LastName+" "+ age + "años");
        if(direccion==null){
            System.out.println("Sin dirección");
        }
        else{   
        direccion.imprimirDatos();
                }
    }
  
}

class Sucursal{
  private String nombreSucursal;
  private direction direccion;
}