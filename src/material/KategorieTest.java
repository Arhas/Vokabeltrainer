package material;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import fachwert.Vokabel;

public class KategorieTest
{
    public Kategorie _kategorie;
    
    @Test
    public void konstruktorTest()
    {
        ArrayList<Vokabel> testvokabeln = new ArrayList<Vokabel>();
        testvokabeln.add(new Vokabel("Test", "Dies ist ein Test"));
        testvokabeln.add(new Vokabel("Test2", "Dies ist ein weiterer Test"));
        _kategorie = new Kategorie(testvokabeln, "Testkategorie");
        assertEquals(_kategorie._vokabelliste, testvokabeln);
    }
    
    @Test
    public void testFügeVokabelHinzu()
    {
        
    }
    
    @Test
    public void testEntferneVokabel()
    {
        
    }
    
    @Test
    public void testEnthältVokabel()
    {
        
    }
    
    @Test
    public void testGetVokabelliste()
    {
        
    }
}
