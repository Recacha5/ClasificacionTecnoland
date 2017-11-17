/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificaciontecnoland;

/**
 *
 * @author Alex Recacha
 */
public class TecnoLand {
    
    private int edicion;
    private Juego[] vJuegos;

    public TecnoLand(int edicion) {
        this.edicion = edicion;
    }
    
    

    /**
     * @return the edicion
     */
    public int getEdicion() {
        return edicion;
    }

    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    /**
     * @return the vJuegos
     */
    public Juego[] getvJuegos() {
        return vJuegos;
    }

    /**
     * @param vJuegos the vJuegos to set
     */
    public void setvJuegos(Juego[] vJuegos) {
        this.vJuegos = vJuegos;
    }
    
    
    
}
