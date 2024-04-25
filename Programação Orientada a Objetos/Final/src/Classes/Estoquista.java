package Classes;

import Controllers.LoginController;
import javax.swing.JOptionPane;

public class Estoquista extends Funcionario implements Login {
    
    LoginController lc = new LoginController();
    
    public Estoquista() {}
    
    public Estoquista(String usuario, String senha) {
        super(usuario, senha);
    }

    @Override
    public boolean logado() {
        if(lc.existeLogin(usuario, senha, "Estoquista")) {
            JOptionPane.showMessageDialog(null, "Bem-vindo, Estoquista!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos!");
           return false; 
        }
    }
}
