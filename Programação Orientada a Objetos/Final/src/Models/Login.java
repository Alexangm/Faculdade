package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends DAO {
    
    private PreparedStatement pst = null;
    private ResultSet rs = null;
   
    public Login() {}
    
    public boolean existeUsuario(String usuario) {
        String sql = "SELECT id FROM login WHERE usuario = ?";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, usuario);
            rs = pst.executeQuery();

            return rs.next();
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        } finally {
            this.desconectar(conexao);
        }
    }
    
    public boolean existeLogin(String usuario, String senha, String tipo) {
        String sql = "SELECT usuario FROM login WHERE usuario = ? AND senha = ? AND tipo = ?";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, senha);
            pst.setString(3, tipo);
            rs = pst.executeQuery();

            return rs.next();
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        } finally {
            this.desconectar(conexao);
        }
    }
}