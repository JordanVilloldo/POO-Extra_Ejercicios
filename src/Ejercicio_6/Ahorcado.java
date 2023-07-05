/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

/**
 *
 * @author Jordan
 */
public class Ahorcado {
    
    private char[] palabra;
    private int letrasEncontradas = 0;
    private int intentos = 0;
    private int maxIntentos;
    private char[] palabraActual;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int maxIntentos) {
        this.palabra = palabra;
        this.maxIntentos = maxIntentos;
        palabraActual = new char[palabra.length];
    }

    public char[] getPalabra() {
        return palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getMaxIntentos() {
        return maxIntentos;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public char[] getPalabraActual() {
        return palabraActual;
    }

    public void setPalabraActual(char[] palabraActual) {
        this.palabraActual = palabraActual;
    }
    
    
    
    
}
