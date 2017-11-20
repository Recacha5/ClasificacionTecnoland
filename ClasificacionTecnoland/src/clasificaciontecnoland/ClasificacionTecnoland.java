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
                
                case 1: tecnoland.verJuegos();
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
                        juegoSeleccionado = leer.nextLine().trim();
                        while (opcion != 5){
                        Menus.MenuJuego();
                        System.out.println("Dime qué opción eliges");
                        opcion = leer.nextInt();
                        switch (opcion){
                            case 1: tecnoland.seleccionarJuego(juegoSeleccionado).anadirParticipante();
                                    System.out.println("Pulsa enter para continuar...");
                                    sc.nextLine();
                                    break;
                            case 2: tecnoland.seleccionarJuego(juegoSeleccionado).verJugadores();
                                    System.out.println("Pulsa enter para continuar...");
                                    sc.nextLine();
                                    break;
                            case 3: tecnoland.seleccionarJuego(juegoSeleccionado).ponerPuntosJugador();
                                    System.out.println("Pulsa enter para continuar...");
                                    sc.nextLine();
                                    break;
                            case 4: tecnoland.seleccionarJuego(juegoSeleccionado).ganadores();
                                    System.out.println("Pulsa enter para continuar...");
                                    sc.nextLine();
                                    break;
                                    
                            case 5: System.out.println("Pulsa enter para continuar...");
                                    sc.nextLine();
                                    opcion = 5;
                                    break;
                        }
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
