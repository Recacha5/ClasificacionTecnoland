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
    
    public boolean anadirParticipante(){
        
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
                if (participante[i] == null) {
                    participante[i] = new Jugador (nombre, edad);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean ponerPuntosJugador(){
        
        String nombre;
        int cantidad;
        System.out.println("Dime a qué jugador vas a añadir puntuación");
        nombre = leer.nextLine().trim();
        System.out.println("Dime cuántos puntos vas a añadirle a: " + nombre);
        cantidad = leer.nextInt();
        for (int i = 0; i < participante.length; i++) {

            if (participante[i].getNombre().equalsIgnoreCase(nombre)) {
                participante[i].setPuntuacion(cantidad);
                return true;
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador[] getParticipante() {
        return participante;
    }

    public void setParticipante(Jugador[] participante) {
        this.participante = participante;
    }

    
    public String verJugadores() {

        String aux="";
        for (Jugador a:participante){
            if (a!=null){
            aux+= a.toString();
            }
        }
        return aux;
    }
}
