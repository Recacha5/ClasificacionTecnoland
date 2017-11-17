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
public class Juego {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private Jugador[] participante;

    public Juego(String nombre) {
        this.nombre = nombre;
        this.participante = new Jugador[5];
        
    }
    
    public Jugador[] ganadores(){
        
        Jugador vGanadores[] = new Jugador[4];
        Jugador prueba = new Jugador ("prueba", 0);
        for (int i = 1; i < vGanadores.length; i++) {
            vGanadores[i] = participante[0];
        }
        
        for (int i = 1; i < vGanadores.length; i++) {
            if (vGanadores[0].getPuntuacion()<participante[i].getPuntuacion())
                vGanadores[0] = participante[i];
        }
        for (int i = 1; i < vGanadores.length; i++) {
            if (participante[i]!=vGanadores[0] && vGanadores[1].getPuntuacion()<participante[i].getPuntuacion())
                vGanadores[1] = participante[i];
        }
        for (int i = 1; i < vGanadores.length; i++) {
            if (participante[i]!=vGanadores[0] && participante[i]!=vGanadores[1] &&vGanadores[1].getPuntuacion()<participante[i].getPuntuacion())
                vGanadores[2] = participante[i];
        }
        
        return vGanadores;
    }
    
    public boolean anadirParticipante(Jugador[] jugador){
        
        String nombre;
        int edad, cantidad;
        System.out.println("Dime cuantos jugadores vas a introducir");
        cantidad = leer.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("Dime el nombre de un jugador");
            nombre = leer.nextLine().trim();
            System.out.println("Dime la edad de " + nombre);
            edad = leer.nextInt();
            
            for (int j = 0; j < participante.length; j++) {
                if (participante[i] != new Jugador (nombre, edad)) {
                    participante[i] = new Jugador (nombre, edad);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean ponerPuntosJugador(int puntos, String nombreJugador){
        
        
        
        //Devolver true si se han añadido correctamente
        //False si no se han podido añadir por no encontrar el jugador
        return false;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the participante
     */
    public Jugador[] getParticipante() {
        return participante;
    }

    /**
     * @param participante the participante to set
     */
    public void setParticipante(Jugador[] participante) {
        this.participante = participante;
    }

}
