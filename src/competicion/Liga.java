package competicion;

import java.util.ArrayList;

/**
 *
 * @author Imad
 */
public class Liga extends Competicion {

    public Liga(ArrayList<Jugador> jugadores) {

        this.jugadores = jugadores;
        this.partidos = new ArrayList<>();
    }

    @Override
    public void GenerarPartidos(ArrayList<Jugador> jugadores)
    {
        int numJug = jugadores.size();
        if(numJug%2 != 0)
        {
            Jugador j = new Jugador("Descanso");
            numJug++;
            jugadores.add(j);
        }

        int totalP = (numJug * (numJug - 1)) / 2; //total de partidos de una vuelta
        String[] local = new String[totalP];
        String[] visita = new String[totalP];
        int modIF = (numJug / 2);//para hacer mod cada inicio de fecha
        int indiceInverso = numJug - 2;

        for (int i = 0; i < totalP; i++) {
            if (i % modIF == 0) {//seria el partido inicial de cada fecha
                //se pone uno local otro  visita al ultimo equipo
                if (i % 2 == 0) {
                    local[i] = jugadores.get(i % (numJug - 1)).getNombre();
                    visita[i] = jugadores.get(numJug - 1).getNombre();
                } else {
                    local[i] = jugadores.get(numJug - 1).getNombre();
                    visita[i] = jugadores.get(i % (numJug - 1)).getNombre();
                }
            } else {
                local[i] = jugadores.get(i%(numJug - 1)).getNombre();
                visita[i] = jugadores.get(indiceInverso).getNombre();
                --indiceInverso;
                if (indiceInverso < 0) {
                    indiceInverso = numJug - 2;
                }
            }
        }
        Partido p;
        for (int i = 0; i < totalP; i++)
        {
            p = new Partido(local[i], visita[i]);
            partidos.add(p);
        }
    }
}
