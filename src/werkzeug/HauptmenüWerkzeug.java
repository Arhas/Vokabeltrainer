package werkzeug;

import service.HauptmenüService;

public class HauptmenüWerkzeug
{
    HauptmenüUI _ui;
    HauptmenüService _service;

    public HauptmenüWerkzeug()
    {
        _ui = new HauptmenüUI();
        _service = new HauptmenüService();
        _ui.getAuswählButton().addActionListener(_service.starteAbfrage(_ui.getPfadFeld().getText()));
    }

    public void zeigeFenster()
    {
        _ui.zeigeFenster();
    }
}
