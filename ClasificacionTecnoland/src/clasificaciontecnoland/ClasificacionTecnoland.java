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
        Scanner sc = new Scanner(System.in);
        TecnoLand tecnoland = new TecnoLand(2017);
        String juegoSeleccionado;
        int opcion = 0;
        
        while (opcion != 4){
            Menus.Menu();
            System.out.println("Dime qué opción eliges");
            opcion = leer.nextInt();
            switch (opcion){
                
                case 1: System.out.println(tecnoland.verJuegos());
                        System.out.println("Pulsa enter para continuar...");
                        sc.nextLine();
                        break;
                case 2: if (tecnoland.anadirJuego()){
                            System.out.println("Añadido correctamente.");
                        }else{
                            System.out.println("No quedan huecos.");
                        };
                        System.out.println("Pulsa enter para continuar...");
                        sc.nextLine();
                        break;
                case 3: System.out.println("Dime el juego que eliges");
                        Scanner leer1 = new Scanner(System.in);
                        juegoSeleccionado = leer1.nextLine().trim();
                        if (tecnoland.seleccionarJuego(juegoSeleccionado) != null){
                            while (opcion != 5){
                                System.out.println("Juego seleccionado correctamente");
                                Menus.MenuJuego();
                                System.out.println("Dime qué opción eliges");
                                opcion = leer.nextInt();

                                    switch (opcion){
                                        case 1: tecnoland.seleccionarJuego(juegoSeleccionado).anadirParticipante();
                                                System.out.println("Pulsa enter para continuar...");
                                                sc.nextLine();
                                                break;
                                        case 2: System.out.println(tecnoland.seleccionarJuego(juegoSeleccionado).verJugadores());
                                                System.out.println("Pulsa enter para continuar...");
                                                sc.nextLine();
                                                break;
                                        case 3: if (tecnoland.seleccionarJuego(juegoSeleccionado).ponerPuntosJugador() == true){
                                                    System.out.println("Añadidos puntos correctamente");
                                                }else{
                                                    System.out.println("Fallo al poner puntos");
                                                }
                                                System.out.println("Pulsa enter para continuar...");
                                                sc.nextLine();
                                                break;
                                        case 4: Jugador vGanadores[] = tecnoland.seleccionarJuego(juegoSeleccionado).ganadores();
                                                int posicion=1;
                                                for (int i = 0; i < vGanadores.length; i++) {
                                                    if (vGanadores[i].getNombre() != null){
                                                        System.out.println("Posicion: " + posicion + "\n" + vGanadores[i]);
                                                        posicion++;
                                                    }
                                                }
                                                
                                                System.out.println("Pulsa enter para continuar...");
                                                sc.nextLine();
                                                break;

                                        case 5: System.out.println("Pulsa enter para continuar...");
                                                sc.nextLine();
                                                opcion = 5;
                                                break;
                                    }
                            }
                        }else{
                            System.out.println("El juego no existe");
                        }
                        break;
                case 4: System.out.println("Pulsa enter para continuar...");
                        sc.nextLine();
                        opcion = 4;
                        break;
            }
        }
        
        
    }
    
}
