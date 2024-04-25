package Classes;

import javax.swing.JButton;

public class Visitante extends Visitar{

    @Override
    public void desativa(JButton a, JButton b) {
        a.setEnabled(false);
        b.setEnabled(false);
    }
    
}
