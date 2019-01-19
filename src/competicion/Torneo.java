package competicion;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Imad
 */
public class Torneo extends Competicion {

    public Torneo(ArrayList<Jugador> jugadores) {

        this.jugadores = jugadores;
        this.partidos = new ArrayList();
    }

    @Override
    public void GenerarPartidos(ArrayList<Jugador> jugadores) {
        if(jugadores.size()%2 != 0)
        {
            Jugador j = new Jugador("Descanso");
            jugadores.add(j);
        }
        Collections.shuffle(jugadores);
        int indice = 0;
        // Toma los equipos dos a dos para el emparejamiento
        while (indice < jugadores.size()) {
            partidos.add(new Partido(jugadores.get(indice).getNombre(), jugadores.get(indice + 1).getNombre()));
            indice += 2;
        }
    }
}
