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
public class TecnoLand {
    Scanner leer = new Scanner(System.in);
    private int edicion;
    private Juego[] vJuegos;

    public TecnoLand(int edicion) {
        this.edicion = edicion;
        this. vJuegos = new Juego[3];
    }

    public String verJuegos(){
        String aux="";
        
        for (Juego a:vJuegos){
            if (a!=null){
            aux += a.toString() + "\n";
            }
        }
        return aux;
    }
    
    public Juego seleccionarJuego(String nombreJuego){
        
        int posicion = 0;
        
        for (int i = 0; i < vJuegos.length; i++) {
            
            if (vJuegos[i] != null && vJuegos[i].getNombre().equalsIgnoreCase(nombreJuego) ) {
                return vJuegos[i];
            }
        }
       return null;
    }

    public boolean anadirJuego(){
        
        for (int i = 0; i < vJuegos.length; i++) {
                
            if (vJuegos[i] == null) {
                System.out.println("Dime el nombre del juego");
                vJuegos[i] = new Juego (leer.nextLine());
                return true;
            }
        }
        return false;
    }
    
    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public Juego[] getvJuegos() {
        return vJuegos;
    }

    public void setvJuegos(Juego[] vJuegos) {
        this.vJuegos = vJuegos;
    }

}
