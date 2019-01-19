package competicion;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Imad
 */
public class Liga extends Competicion {

    public Liga(ArrayList<Jugador> jugadores) {

        this.jugadores = jugadores;
        this.partidos = new ArrayList();
    }

    @Override
    public void GenerarPartidos(ArrayList<Jugador> jugadores) {

        int num = 0;
        for (int i = 0; i < jugadores.size()/2; i++) {
            Partido p = new Partido(jugadores.get(num).getNombre(), jugadores.get(num + 1).getNombre());
            partidos.add(p);
            num = num + 2;
        }  
    }
}
