package competicion;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Imad
 */
public class Jugador
{
    private static final AtomicInteger count = new AtomicInteger(0);
    private String nombre;
    private int id;
    private int partGanados;
    private int partPerdidos;
    private int partEmpatados;
    private int gFavor;
    private int gContra;
    private int puntos;
    
    public Jugador(String nombre)
    {
        this.id = count.incrementAndGet();
        this.nombre = nombre;
        partGanados = 0;
        partPerdidos = 0;
        partEmpatados = 0;
        gFavor = 0;
        gContra = 0;
        puntos = 0;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getNombre() 
    {
        return nombre;
    }

    public int getPartGanados() 
    {
        return partGanados;
    }

    public void setPartGanados() 
    {
        this.partGanados++;
    }

    public int getPartPerdidos() 
    {
        return partPerdidos;
    }

    public void setPartPerdidos() 
    {
        this.partPerdidos++;
    }

    public int getPartEmpatados() 
    {
        return partEmpatados;
    }

    public void setPartEmpatados() 
    {
        this.partEmpatados++;
    }

    public int getgFavor() 
    {
        return gFavor;
    }

    public void setgFavor(int gFavor) 
    {
        this.gFavor = this.gFavor + gFavor;
    }

    public int getgContra() 
    {
        return gContra;
    }

    public void setgContra(int gContra) 
    {
        this.gContra = this.gContra + gContra;
    }

    public int getPuntos() 
    {
        return puntos;
    }

    public void setPuntos(int puntos) 
    {
        this.puntos = this.puntos + puntos;
    }
}
