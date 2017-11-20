/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificaciontecnoland;

/**
 *
 * @author Alex Recacha
 * 
 */
public class Jugador {
    
    private String nombre;
    private int edad;
    private int puntuacion;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Jugador(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Puntuación: " + puntuacion +"\n\n";
    }
}
