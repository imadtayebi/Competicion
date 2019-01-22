package competicion;

public class Partido
{
    private String local;
    private String visitante;
    private String golesL;
    private String golesV;
    private String ganador;
    
    public Partido(String l, String v)
    {
        local = l;
        visitante = v;
        golesL = "";
        golesV = "";
    }
    
    public String getLocal()
    {
        return local;
    }
    
    public void setLocal(String j)
    {
        local = j;
    }
    
    public String getVisitante()
    {
        return visitante;
    }
    
    public void setVisitante(String j)
    {
        visitante = j;
    }

    public String getGolesL() {
        return golesL;
    }

    public void setGolesL(String golesL) {
        this.golesL = golesL;
    }

    public String getGolesV() {
        return golesV;
    }

    public void setGolesV(String golesV) {
        this.golesV = golesV;
    }

    /**
     * @return the ganador
     */
    public String getGanador() {
        return ganador;
    }

    /**
     * @param ganador the ganador to set
     */
    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
    
}
