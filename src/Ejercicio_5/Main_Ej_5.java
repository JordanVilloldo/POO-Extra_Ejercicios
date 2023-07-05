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
public class Main_Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MesService ms = new MesService();
        Mes mes = ms.crearObjeto();
        ms.encontrarMes(mes);
    }

}
