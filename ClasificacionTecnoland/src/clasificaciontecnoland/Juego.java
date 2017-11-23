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
    Scanner leer1 = new Scanner(System.in);
    private String nombre;
    private Jugador[] participante;

    public Juego(String nombre) {
        this.nombre = nombre;
        this.participante = new Jugador[5];
        
    }

    public Jugador[] ganadores(){
        
        Jugador vGanadores[] = new Jugador[3];
        
        for (int i = 0; i < vGanadores.length; i++) {
            vGanadores[i] = new Jugador();
        }
        for (int i = 1; i < vGanadores.length; i++) {
            if (participante[i] != null && vGanadores[0].getPuntuacion()<participante[i].getPuntuacion()){
                vGanadores[1] = vGanadores[0];
                vGanadores[0] = participante[i];
            }
        }
        for (int i = 1; i < vGanadores.length; i++) {
            if (participante[i] != null && participante[i]!=vGanadores[0] && vGanadores[1].getPuntuacion()<participante[i].getPuntuacion() && vGanadores[0].getPuntuacion()>participante[i].getPuntuacion()){
                vGanadores[2] = vGanadores[1];
                vGanadores[1] = participante[i];
            }
        }
        for (int i = 1; i < vGanadores.length; i++) {
            if (participante[i] != null && participante[i]!=vGanadores[0] && participante[i]!=vGanadores[1] && vGanadores[2].getPuntuacion()<participante[i].getPuntuacion() && vGanadores[1].getPuntuacion()>participante[i].getPuntuacion()){
                vGanadores[2] = participante[i];
            }
        }
        
        return vGanadores;
    }
    
    public boolean anadirParticipante(){
        
        String nombre;
        int edad;
        System.out.println("Dime el nombre del nuevo jugador");
        nombre = leer1.nextLine().trim();
        System.out.println("Dime la edad de " + nombre);
        edad = leer.nextInt();
            for (int i = 0; i < participante.length; i++) {

                if (participante[i] == null) {
                    participante[i] = new Jugador (nombre, edad);
                    return true;
                }
            }

        return false;
    }
    
    public boolean ponerPuntosJugador(){
        
        String nombre;
        int cantidad;
        System.out.println("Dime a qué jugador vas a añadir puntuación");
        nombre = leer1.nextLine().trim();
        System.out.println("Dime cuántos puntos vas a añadirle a: " + nombre);
        cantidad = leer.nextInt();
        for (int i = 0; i < participante.length; i++) {

            if (participante[i] != null && participante[i].getNombre().equalsIgnoreCase(nombre)) {
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
            aux += a.toString();
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        return this.nombre + "\n";
    }
    
}
