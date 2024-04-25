package Classes;

import Controllers.LoginController;
import javax.swing.JOptionPane;

public class Vendedor extends Funcionario implements Login {
    
    LoginController lc = new LoginController();
    
    public Vendedor() {}
    
    public Vendedor(String usuario, String senha) {
        super(usuario, senha);
    }

    @Override
    public boolean logado() {
        if(lc.existeLogin(usuario, senha, "Vendedor")) {
            JOptionPane.showMessageDialog(null, "Bem-vindo, Vendedor!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos!");
           return false; 
        }
    }
}
