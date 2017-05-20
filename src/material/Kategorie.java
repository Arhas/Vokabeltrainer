package material;

import java.util.ArrayList;

import org.junit.Test;

import fachwert.Vokabel;

public class Kategorie
{
    public ArrayList<Vokabel> _vokabelliste = new ArrayList<Vokabel>();
    
    public Kategorie()
    {
        
    }
    
    public Kategorie(ArrayList<Vokabel> vokabeln)
    {
        _vokabelliste = vokabeln;
    }
    
    public void fügeVokabelHinzu(Vokabel vokabel)
    {
        
    }
    
    public void entferneVokabel(Vokabel vokabel)
    {
        
    }
    
    public boolean enthältVokabel(Vokabel vokabel)
    {
        return false;
    }
    
    @Test
    public ArrayList<Vokabel> getVokabelliste()
    {
        return null;
    }
}
