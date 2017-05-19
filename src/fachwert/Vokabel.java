package fachwert;

public class Vokabel
{
public String _fachwort;
public String _definition;

    public Vokabel(String fachwort, String definition)
    {
        _fachwort = fachwort;
        _definition = definition;
    }
    public String getDefinition()
    {
        return _definition;
    }
    public String getFachwort()
    {
        return _fachwort;
    }
}
