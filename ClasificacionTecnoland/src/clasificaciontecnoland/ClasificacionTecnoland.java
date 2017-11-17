/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificaciontecnoland;

import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class ClasificacionTecnoland {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TecnoLand tecnoland = new TecnoLand(2017);
        String nombre;
        int edad;
        
        System.out.println("Dime el nombre de un jugador");
        nombre = leer.nextLine();
        System.out.println("Dime la edad de " + nombre);
        edad = leer.nextInt();
        
        Jugador j1 = new Jugador (nombre, edad);
        
        
    }
    
}
