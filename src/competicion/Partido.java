package competicion;

public class Partido
{
    private String local;
    private String visitante;
    private int[] goles;
    
    public Partido(String l, String v)
    {
        local = l;
        visitante = v;
        goles = new int[2];
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
    
    public void setGoles(int[] g)
    {
        goles[0] = g[0];
        goles[1] = g[1];
    }    
}
