package werkzeug;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class HauptmenüUI
{
    public JPanel _hauptpanel;
    public JFrame _frame;
    public JButton _hinzufügenButton;
    public JButton _entferneButton;
    public JButton _auswählButton;
    public JTextField _dateipfad;
    public JPanel _leer;
    
    public HauptmenüUI()
    {
        _leer = new JPanel();
        _dateipfad = new JTextField(100);
        
        _hinzufügenButton = new JButton("Kategorie hinzufügen");
        _entferneButton = new JButton("Kategorie entfernen");
        _auswählButton = new JButton("Kategorie auswählen");
        
        _frame = new JFrame("Vokabeltrainer");
        _frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        _hauptpanel = new JPanel();
        _hauptpanel.setLayout(new GridLayout(2, 3));
        
        _hauptpanel.add(_dateipfad);
        _hauptpanel.add(_hinzufügenButton);
        _hauptpanel.add(_entferneButton);
        _hauptpanel.add(_auswählButton);
        
        _frame.add(_hauptpanel);
        _frame.pack();
        _frame.setSize(1280, 720);
        
    }
    
    public void zeigeFenster()
    {
        _frame.setVisible(true);
        
    }
    
    public JButton getAuswählButton()
    {
        return _auswählButton;
    }
    
    public JButton getHinzufügeButton()
    {
        return _hinzufügenButton;
    }
    
    public JButton getEntferneButton()
    {
        return _entferneButton;
    }
    
    public JTextField getPfadFeld()
    {
        return _dateipfad;
    }
}
