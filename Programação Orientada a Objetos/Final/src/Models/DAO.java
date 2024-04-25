package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {    
    Connection conexao;
    String url, user, passwd;

    /**
     * Construtor público de DAO
     */
    public DAO() {
        url = "jdbc:mysql://localhost:3306/bdloja"; //versão 5
        //url = "jdbc:mysql://localhost:3306/bdloja?serverTimezone=UTC"; //versão 8.1
        user = "root"; //usuário
        passwd = "123456"; //senha do usuário
        conexao = null;
    }
    
    /**
     * Faz conexão ao Bando de Dados bdloja
     * @return Connection
     */
    public Connection conectar(){
        try {
            conexao = DriverManager.getConnection(url, user, passwd);
            return conexao;
        }
        catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
    
    /**
     * Desconecta com o Banco de Dados bdloja
     * @param c 
     * return 
     */
    public void desconectar(Connection c) {
        try {
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }    
}