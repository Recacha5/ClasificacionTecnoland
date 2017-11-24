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
public class Menus {
    
    //El menu tiene que devolver el numero de opción y se muestra hasta que sea válida
    //controlar errores string
    public static void Menu(){
        
        System.out.println("----------------");
        System.out.println("1- Ver Juegos.");
        System.out.println("2- Añadir Juego.");
        System.out.println("3- Elegir Juego.");
        System.out.println("4- Salir.");
        System.out.println("----------------");
        
    }
    
    public static void MenuJuego(){
        
        System.out.println("----------------------------------");
        System.out.println("1- Añadir Jugador.");
        System.out.println("2- Ver Jugadores.");
        System.out.println("3- Añadir puntuación a un jugador.");
        System.out.println("4- Ver ganadores.");
        System.out.println("5- Salir al menú principal.");
        System.out.println("----------------------------------");
        
    }
}
