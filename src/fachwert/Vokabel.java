package fachwert;
/*
 * Eine Vokabel besteht aus einem Fachwort und der Zugehörigen Definition. Einmal erstellt, soll das Objekt unverändert bleiben.
 */
public class Vokabel
{
public final String FACHWORT;
public final String DEFINITION;

    
    public Vokabel(String fachwort, String definition)
    {
        FACHWORT = fachwort;
        DEFINITION = definition;
    }
    
    /**
     * Gibt die zugehörige Definition zurück
     * @return DEFINITION
     */
    public String getDefinition()
    {
        return DEFINITION;
    }
    
    /**
     * Gibt das zugehörige Fachwort zurück
     * @return FACHWORT
     */
    public String getFachwort()
    {
        return FACHWORT;
    }
}
