package werkzeug;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class HauptmenüUI
{
    public JPanel _hauptpanel;
    public JFrame _frame;
    public HauptmenüUI()
    {
        _frame = new JFrame();
        _frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        _hauptpanel = new JPanel();
        _hauptpanel.setLayout(new CardLayout());
        
    }
}
