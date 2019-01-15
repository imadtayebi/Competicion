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
public class Liga extends Competicion {

    private ArrayList<Jugador> jugadores;
    private ArrayList<Partido> partidos;
    // El nombre de los equipos sera "jugador" + un numero
    public String NOMBRE;

    public Liga(ArrayList<Jugador> jugadores, ArrayList<Partido> partidos) {

        this.jugadores = new ArrayList();
        this.partidos = new ArrayList();
 
    }

}
