/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

/**
 *
 * @author Jordan
 */
public class MesService {
    
    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    public Mes crearObjeto() {
        Mes m1 = new Mes();
        int num = (int) (Math.random() * m1.getMes().length);
        m1.setMesSecreto(m1.getMes()[num]);
        return m1;
    }

    public void encontrarMes(Mes mes) {
        
        do {
            System.out.println("Adivine el mes secreto. Introduzca el mes en minusculas");
            String respuesta = leer.nextLine();

            if (respuesta.equalsIgnoreCase(mes.getMesSecreto())) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
        } while (true);
    }
}
