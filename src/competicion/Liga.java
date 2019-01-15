/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competicion;

import java.util.ArrayList;

/**
 *
 * @author Imad
 */
public class Liga extends Competicion{
    
    private ArrayList<Jugador> jugadores;
    private ArrayList<Jornada> jornadas;
    // El nombre de los equipos sera "jugador" + un numero
    public static final String NOMBRE ="Jugador";

    
     public Liga(int numJugadores)
    {
        jugadores = new ArrayList();
        jornadas = new ArrayList();
        
        for(int i = 0; i < numJugadores; i++)
        {
            Jugador jugador = new Jugador(NOMBRE + " " + (i + 1));
            jugadores.add(jugador);
        }
        
        
        
      
    }
    
    
}
