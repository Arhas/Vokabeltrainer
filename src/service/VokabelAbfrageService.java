package service;

import fachwert.Vokabel;
import material.Kategorie;

public class VokabelAbfrageService
{
    public Kategorie _kategorie;
    
    public VokabelAbfrageService(Kategorie kategorie)
    {
        _kategorie = kategorie;
    }
    
    
    
    public boolean prüfeAntwortAufFachwort(Vokabel vokabel,String definition)
    {
      return (vokabel.getDefinition().equals(definition));  
    }
    
    public boolean prüfeAntwortAufDefinition(Vokabel vokabel, String fachwort)
    {
        return (vokabel.getFachwort().equals(fachwort));
    }
    
    
}
