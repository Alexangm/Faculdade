package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Venda extends DAO {
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public Venda() {}

    public TableModel all() {
        String sql = "SELECT id as \"ID\", cliente_id as \"Cliente ID\", produto_id1 as \"Produto1 ID\", "
                + "produto_id2 as \"Produto2 ID\", produto_id3 as \"Produto3 ID\", produto_id4 as \"Produto4 ID\", "
                + "produto_id5 as \"Produto5 ID\" FROM venda";
        TableModel tb = null;

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            tb = DbUtils.resultSetToTableModel(rs);
            this.desconectar(this.conexao);
            return tb;
        } catch (SQLException ex) {
            System.out.println(ex);
            return tb;
        }
    }
    
    public boolean save(String cliente_id, String produto_id1, String produto_id2, String produto_id3, String produto_id4, String produto_id5, double valor) {
        String sql = "INSERT INTO venda (cliente_id, produto_id1, produto_id2, produto_id3, produto_id4, produto_id5, valor) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, cliente_id);
            pst.setString(2, produto_id1);
            pst.setString(3, produto_id2);
            pst.setString(4, produto_id3);
            pst.setString(5, produto_id4);
            pst.setString(6, produto_id5);
            pst.setDouble(7, valor);
            pst.executeUpdate();
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    public TableModel findVendaByName (String name){
        String sql = "SELECT id as \"ID\", cliente_id as \"Cliente ID\", produto_id1 as \"Produto1 ID\", "
                + "produto_id2 as \"Produto2 ID\", produto_id3 as \"Produto3 ID\", produto_id4 as \"Produto4 ID\", "
                + "produto_id5 as \"Produto5 ID\" FROM venda where name = ?";
        TableModel tb = null;

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, name);
            rs = pst.executeQuery();
            tb = DbUtils.resultSetToTableModel(rs);
            this.desconectar(this.conexao);
            return tb;
        } catch (SQLException ex) {
            System.out.println(ex);
            return tb;
        } 
    }

    public boolean destroy(int id) {
        String sql = "DELETE FROM venda WHERE id=?";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

}