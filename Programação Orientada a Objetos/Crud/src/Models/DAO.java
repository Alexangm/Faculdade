package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {    
    Connection conexao;
    String url, user, passwd;
    
    public DAO() {
        url = "jdbc:mysql://localhost:3306/dataB?serverTimezone=UTC";
        user = "root";
        passwd = "123456";
        conexao = null;
    }
    
    public Connection conectar(){
        try {
            conexao = DriverManager.getConnection(url, user, passwd);
            System.out.println("Conectado com sucesso!");
            return conexao;
        }
        catch (SQLException ex) {
            System.out.println("entrou aqui");
            System.out.println(ex);
            return null;
        }
    }
    
    public void desconectar(Connection c) {
        try {
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }    
}
