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
    private ArrayList<Jornada> jornadas;
    // El nombre de los equipos sera "jugador" + un numero
    public String NOMBRE;

    public Liga(ArrayList<Jugador> jugadores, ArrayList<Jornada> jornadas) {

        this.jugadores = new ArrayList();
        this.jornadas = new ArrayList();

    }

}
