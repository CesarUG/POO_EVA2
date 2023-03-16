/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_formato_apa;

/**
 *
 * @author Cesar
 */
public class EVA2_4_FORMATO_APA {

    public static void main(String[] args) {
     //Libro
     Libros libro1 = new Libros();
     libro1.setAutor("Edgar Allan Poe");
     libro1.setTitle("El cuervo");
     libro1.setYear(1845);
     libro1.setMonth("Enero");
     libro1.setDay(29);
     libro1.setCity("New York");
     libro1.setEdicion("2da");
     libro1.setEditor("SI");
    //Imprimir
        System.out.println("-----CITA BIBLIOGRAFICA LIBRO-----");
        System.out.println("Autor: "+libro1.getAutor());    
        System.out.println("Titulo : "+libro1.getTitle());
        System.out.println("Año: "+libro1.getYear());
        System.out.println("Mes: "+libro1.getMonth());
        System.out.println("día: "+libro1.getDay());
        System.out.println("Ciudad: "+libro1.getCity());
        System.out.println("Edición: "+libro1.getEdicion());
        System.out.println("Editor: "+libro1.getEditor());
     //Artículo
     Articulos articulo1 = new Articulos();
      articulo1.setAutor("Vegetta777");
      articulo1.setTitle("Wigetta");
      articulo1.setYear(2014);
      articulo1.setMonth("Julio");
      articulo1.setDay(21);
      articulo1.setCity("Madrid");
      articulo1.setNameMagazine("JuegoPapu");
      articulo1.setNumArticulo(777);
      
      System.out.println("-----CITA BIBLIOGRAFICA ARTÍCULO-----");
      System.out.println("Autor: "+articulo1.getAutor());    
      System.out.println("Titulo : "+articulo1.getTitle());
      System.out.println("Año: "+articulo1.getYear());
      System.out.println("Mes: "+articulo1.getMonth());
      System.out.println("día: "+articulo1.getDay());
      System.out.println("Ciudad: "+articulo1.getCity());
      System.out.println("Nombre de la revista: "+articulo1.getNameMagazine());
      System.out.println("Número de artículo: "+articulo1.getNumArticulo());
      //Informe
      Informe informe1 = new Informe();
      informe1.setAutor("Juan");
      informe1.setTitle("Cosas POO");
      informe1.setYear(2020);
      informe1.setMonth("Julio");
      informe1.setDay(21);
      informe1.setCity("Chihuahua");
      informe1.setColaboradores("Juan Rulfo, Willyrex, DiGref");
      informe1.setNumIdentificacion(55);
        
      System.out.println("-----CITA BIBLIOGRAFICA INFORME-----");
      System.out.println("Autor: "+informe1.getAutor());    
      System.out.println("Titulo : "+informe1.getTitle());
      System.out.println("Año: "+informe1.getYear());
      System.out.println("Mes: "+informe1.getMonth());
      System.out.println("día: "+informe1.getDay());
      System.out.println("Ciudad: "+informe1.getCity());
      System.out.println("Número de indetificación: "+informe1.getNumIdentificacion());
      System.out.println("Colaboradores: "+informe1.getColaboradores());
        
      Sitio_web sitio1 = new Sitio_web();
      sitio1.setAutor("PEPE");
      sitio1.setTitle("MAMEMIMOMAMU");
      sitio1.setYear(2023);
      sitio1.setMonth("Julio");
      sitio1.setDay(21);
      sitio1.setCity("Chihuahua");
      sitio1.setUrl("https://cacoo.com/diagrams/CUWwWgJUvXA5UKfK/5414F");
      sitio1.setAccessDate("21 de julio del 2023");
      
      //imprimir
      System.out.println("-----CITA BIBLIOGRAFICA SITIO WEB-----");
      System.out.println("Autor: "+sitio1.getAutor());    
      System.out.println("Titulo : "+sitio1.getTitle());
      System.out.println("Año: "+sitio1.getYear());
      System.out.println("Mes: "+sitio1.getMonth());
      System.out.println("día: "+sitio1.getDay());
      System.out.println("Ciudad: "+sitio1.getCity());
      System.out.println("URL: "+sitio1.getUrl());
      System.out.println("Fecha de acceso: "+sitio1.getAccessDate());
      
     
    }
}
