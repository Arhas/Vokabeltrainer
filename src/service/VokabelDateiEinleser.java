package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import fachwert.Vokabel;


public class VokabelDateiEinleser
{
    public static BufferedReader _bufferedReader;
    public static FileReader _fileReader;
    public static ArrayList<Vokabel> leseEin(File kategorie) throws FileNotFoundException
    {
        ArrayList<Vokabel> vokabelListe = new ArrayList<Vokabel>();
        try(BufferedReader _bufferedReader = new BufferedReader(new FileReader(kategorie)))
        {
            _fileReader = new FileReader(kategorie);
            String zeile;
            while ((zeile = _bufferedReader.readLine()) != null) {
                int semikolonStelle = zeile.indexOf(";");
                String vokabel = zeile.substring(0, semikolonStelle);
                zeile.substring(semikolonStelle + 1);
                String definition = zeile;
                vokabelListe.add(new Vokabel(vokabel, definition));
            }
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return vokabelListe;
       
        
    }
}
