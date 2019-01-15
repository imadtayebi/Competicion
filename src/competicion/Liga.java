/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competicion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Imad
 */
public class Liga extends Competicion{
    
    private ArrayList<Jugador> jugadores;
    private ArrayList<Jornada> jornadas;
    // El nombre de los equipos sera "jugador" + un numero
    public String NOMBRE;

    
     public Liga(int numJugadores)
    {
        Scanner sc = new Scanner(System.in); 
        jugadores = new ArrayList();
        jornadas = new ArrayList();
        System.out.println("Introduce el nombre del jugador: ");
        NOMBRE= sc.nextLine();
        for(int i = 0; i < numJugadores; i++)
        {
            Jugador jugador = new Jugador();
            jugadores.add(jugador);
        }
        
        
        
      
    }
    
    
}
