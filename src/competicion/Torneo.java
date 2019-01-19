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
public class Torneo extends Competicion {

    public Torneo(ArrayList<Jugador> jugadores) {

        this.jugadores = jugadores;
        this.partidos = new ArrayList();

    }

    public void GenerarPartidos(ArrayList<Jugador> jugadores) {

        int num = 0;
        for (int i = 0; i < jugadores.size()/2; i++) {
            Partido p = new Partido(jugadores.get(num).getNombre(), jugadores.get(num + 1).getNombre());
            partidos.add(p);
            num = num + 2;
        }

    }

}
