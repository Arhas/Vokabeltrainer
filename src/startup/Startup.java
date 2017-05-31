package startup;

import javax.swing.SwingUtilities;

import werkzeug.HauptmenüWerkzeug;

public class Startup
{

    public static void main(String[] args)
    {
        HauptmenüWerkzeug hauptmenüwerkzeug = new HauptmenüWerkzeug();
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                hauptmenüwerkzeug.zeigeFenster();
            }
        });

    }

}
