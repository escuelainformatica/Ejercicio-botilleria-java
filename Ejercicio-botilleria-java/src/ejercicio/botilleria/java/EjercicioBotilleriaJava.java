/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.botilleria.java;

import ejercicio.botilleria.java.modelo.CategoriaCerveza;
import ejercicio.botilleria.java.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class EjercicioBotilleriaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CategoriaCerveza catCervezas=new CategoriaCerveza(1,"Cerveza Nacional");
        
        Producto escudo=new Producto();
        escudo.setId(1);
        escudo.setGrado(4);
        escudo.setNombre("Cerveza Escudo");
        escudo.setCategoriaCerveza(catCervezas);
        
        
    }
    
}
