/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

import java.util.Arrays;

/**
 *
 * @author Jordan
 */
public class AhorcadoService {

    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    Ahorcado a1;

    public void crearJuego() {

        System.out.println("Ingrese la palabra");
        char[] palabra = leer.next().toCharArray();

        System.out.println("Ingrese la cantidad maxima de intentos");
        int maxIntentos = leer.nextInt();

        a1 = new Ahorcado(palabra, maxIntentos);
    }

    public int longitud() {
        return a1.getPalabra().length;
    }

    public void buscar(char letra) {// buscar una manera mas optima

        char[] palAux = a1.getPalabraActual();
        boolean encontrada = false;

        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (letra == a1.getPalabra()[i]) {
                encontrada = true;
                palAux[i] = letra;
            }
        }//fin for

        //setteamos la palabra
        a1.setPalabraActual(palAux);

        //contamos los intentos
        if (!encontrada) {
            a1.setIntentos(a1.getIntentos() + 1);
        }
    }

    public void mostrarPalabra() {
        System.out.println(Arrays.toString(a1.getPalabraActual()));
    }

    public void intentos() {
        System.out.println("Te quedan " + (a1.getMaxIntentos() - a1.getIntentos()) + " intentos");
    }

    public void mensajeFinal() {
        if (Arrays.equals(a1.getPalabra(), a1.getPalabraActual())) {
            System.out.println("Adivinaste!");
        } else{
            System.out.println("Game over :( \n"
                    + "La palabra era: " + Arrays.toString(a1.getPalabra()));
        }
    }

    public void juego() {

        crearJuego();

        System.out.println("La palabra tiene: " + longitud() + " letras");

        do {
            System.out.println("Ingrese una letra");
            buscar(leer.next().charAt(0));
            mostrarPalabra();
            intentos();

        } while (a1.getIntentos() < a1.getMaxIntentos() && !Arrays.equals(a1.getPalabra(), a1.getPalabraActual()));

        mensajeFinal();
        
    }

}
