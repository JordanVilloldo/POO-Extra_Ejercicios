/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

/**
 *
 * @author Jordan
 */
public class NIFService {
    
    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
    
    
    public NIF crearNif(){
        System.out.println("Ingrea tu DNI");
        long DNI = leer.nextLong();
        
        return new NIF(DNI);
    }
    
    public void mostrar(NIF nif){
        System.out.println("NIF: " + nif.getDNI() + "-" + nif.getLetra());
    }
    
}
