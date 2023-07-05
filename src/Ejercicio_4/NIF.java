/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

import static java.lang.Long.parseLong;

/**
 *
 * @author Jordan
 */
public class NIF {
    
    private long DNI;
    private char letra;
    
    private static char[] calcularLetra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    public NIF() {
    }

    public NIF(long DNI) {
        this.DNI = DNI;
        letra = calcularLetra[(int)DNI%23];
    }
    

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    @Override
    public String toString() {
        return "DNI=" + DNI + "-" + letra;
    }
    
    
    
}
