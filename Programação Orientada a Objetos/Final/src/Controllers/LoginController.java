package Controllers;

import Models.Login;

public class LoginController {
    
    public boolean existeLogin(String usuario, String senha, String tipo){
        return new Login().existeLogin(usuario, senha, tipo);
    }
    
    public boolean existeUsuario(String usuario){
        return new Login().existeUsuario(usuario);
    }
}