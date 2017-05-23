package fachwert;
/*
 * Eine Vokabel besteht aus einem Fachwort und der Zugeh�rigen Definition. Einmal erstellt, soll das Objekt unver�ndert bleiben.
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
     * Gibt die zugeh�rige Definition zur�ck
     * @return DEFINITION
     */
    public String getDefinition()
    {
        return DEFINITION;
    }
    
    /**
     * Gibt das zugeh�rige Fachwort zur�ck
     * @return FACHWORT
     */
    public String getFachwort()
    {
        return FACHWORT;
    }
    
    public String getSpeicherString()
    {
        return FACHWORT + ";" + DEFINITION + "\n";
    }
}
