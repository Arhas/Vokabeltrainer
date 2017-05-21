package material;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import fachwert.Vokabel;

public class Kategorie
{
    public ArrayList<Vokabel> _vokabelliste;
    public String _kategoriename;
    public String _pfad;

    public Kategorie(String name)
    {
        _vokabelliste = new ArrayList<Vokabel>();
        _kategoriename = name;
        _pfad = "./Kategorien/" + _kategoriename + ".txt";
    }

    public Kategorie(ArrayList<Vokabel> vokabeln, String name)
    {
        _vokabelliste = vokabeln;
        _kategoriename = name;
        _pfad = "./Kategorien/" + _kategoriename + ".txt";
    }

    public void fügeVokabelHinzu(Vokabel vokabel)
    {
        _vokabelliste.add(vokabel);

    }

    public void entferneVokabel(Vokabel vokabel)
    {
        if (_vokabelliste.contains(vokabel))
        {
            _vokabelliste.remove(vokabel);
        }
    }

    public boolean enthältVokabel(Vokabel vokabel)
    {
        return _vokabelliste.contains(vokabel);
    }

    public ArrayList<Vokabel> getVokabelliste()
    {
        return _vokabelliste;
    }

    public void speichereVokabel(Vokabel vokabel)
    {
        try (FileWriter filewriter = new FileWriter(_pfad, true))
        {
            filewriter.write(vokabel.getFormatiertenString());
        }
        catch (IOException e)
        {
            System.err.println("Error");
        }
    }
}
