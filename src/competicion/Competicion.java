package competicion;

import java.util.ArrayList;

/**
 *
 * @author Imad
 */
public abstract class Competicion {

    protected ArrayList<Jugador> jugadores;
    protected ArrayList<Partido> partidos;

    public void GenerarPartidos(ArrayList<Jugador> jugadores){};
}
