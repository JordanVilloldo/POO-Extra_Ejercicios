/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author Jordan
 */
public class RaicesService {

    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    public Raices crearEcuacion() {

        System.out.println("Ingrese valor de 'a':");
        double a = leer.nextDouble();

        System.out.println("Ingrese valor de 'b':");
        double b = leer.nextDouble();

        System.out.println("Ingrese valor de 'c':");
        double c = leer.nextDouble();

        return new Raices(a, b, c);
    }

    public boolean tieneRaices(Raices r1) {
        return r1.getDiscriminante() > 0;
    }

    public boolean tieneRaiz(Raices r1) {
        return r1.getDiscriminante() == 0;
    }

    public void obtenerRaices(Raices r1) {
        double raiz = Math.sqrt(r1.getDiscriminante() / (2 * r1.getA()));

        if (tieneRaices(r1)) {
            System.out.println("Las raices son: \n"
                    + raiz + "\n"
                    + -raiz);
        }
    }

    public void obtenerRaiz(Raices r1) {
        double raiz = Math.sqrt(r1.getDiscriminante() / (2 * r1.getA()));

        if (tieneRaiz(r1)) {
            System.out.println("Las raiz es: \n"
                    + raiz);
        }
    }

    public void calular(Raices r1) {
        if (tieneRaices(r1)) {

            obtenerRaices(r1);

        } else if (tieneRaiz(r1)) {

            obtenerRaiz(r1);

        } else {

            System.out.println("No tiene ninguna raiz.");
        }
    }
}
