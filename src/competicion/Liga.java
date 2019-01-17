/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competicion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Imad
 */
public class Liga extends Competicion {

    public Liga(ArrayList<Jugador> jugadores) {

        this.jugadores = jugadores;
        this.partidos = new ArrayList();

    }

    public void GenerarPartidos(ArrayList<Jugador> jugadores) {

        Collections.shuffle(jugadores);
        int indice = 0;
        // Toma los equipos dos a dos para el emparejamiento
        while (indice < jugadores.size()) {
            partidos.add(new Partido(jugadores.get(indice).getNombre(), jugadores.get(indice + 1).getNombre()));
            indice += 2;
        }

    }
    
}
