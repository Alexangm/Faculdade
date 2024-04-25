package Classes;

import Controllers.LoginController;
import javax.swing.JOptionPane;

public class Gerente extends Funcionario implements Login {
    
    LoginController lc = new LoginController();
    
    public Gerente() {}
    
    public Gerente(String usuario, String senha) {
        super(usuario, senha);
    }

    @Override
    public boolean logado() {
        if(lc.existeLogin(usuario, senha, "Gerente")) {
            JOptionPane.showMessageDialog(null, "Bem-vindo, Gerente!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos!");
           return false; 
        }
    }
}
