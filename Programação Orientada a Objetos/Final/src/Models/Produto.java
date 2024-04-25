package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Produto extends DAO {
    
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private final ArrayList produto = new ArrayList();
    
    public Produto() {}
    
    /**
     * Selecionar a tabela Produto por inteira
     * @return Um objeto em TableModel contendo toda a consulta
     */
    public TableModel all() {
        String sql = "SELECT id as \"ID\", nome as \"Nome\", descricao as \"Descrição\", "
                + "preco as \"Preço\", estoque as \"Estoque\" FROM produto";
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
    
    /**
     * Cadastra um produto na tabela produto
     * @param nome
     * @param descricao
     * @param preco
     * @param estoque
     * @return true se o cadastro foi bem executado
     * @return false se o cadastro resultou em uma falha
     */
    public boolean save(String nome, String descricao, double preco, int estoque) {
        String sql = "INSERT INTO produto (nome, descricao, preco, estoque) VALUES(?, ?, ?, ?)";
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, descricao);
            pst.setDouble(3, preco);
            pst.setInt(4, estoque);
            pst.executeUpdate();
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    /**
     * Edita todos os atributos de um produto pelo id
     * @param nome
     * @param descricao
     * @param preco
     * @param estoque
     * @param id
     * @return true se a atualização foi bem sucedida
     * @return false se a atualização foi mal sucedida
     */
    public boolean update(String nome, String descricao, double preco, int estoque, int id) {
        String sql = "UPDATE produto SET nome=?, descricao=?, preco=?, estoque=? WHERE id=?";
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, descricao);
            pst.setDouble(3, preco);
            pst.setInt(4, estoque);
            pst.setInt(5, id);
            pst.executeUpdate();
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    public boolean updateEstoque(int mudanca, int id) {
        String sql = "UPDATE produto SET estoque = estoque + ? WHERE id=?";
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, mudanca);
            pst.setInt(2, id);
            pst.executeUpdate();
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    /**
     * Apaga um determinado produto
     * @param id
     */
    public boolean destroy(int id) {
        String sql = "DELETE FROM produto WHERE id=?";
        
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
    
    public ArrayList findProdutoById(int id) {
        String sql = "SELECT nome, descricao, preco, estoque FROM produto WHERE id = ?";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if(rs.next()) {
                for(int i=1; i<5; i++) produto.add(rs.getString(i));
            } else {
                for(int i=0; i<4; i++) produto.add("");
            }
            
            this.desconectar(this.conexao);
            return produto;
        } catch (SQLException ex) {
            System.out.println(ex);
            return produto;
        }
    }
    
    public String findNomeById(int id) {
        String sql = "SELECT nome FROM produto WHERE id = ?";
        String nome = "";
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if(rs.next()) {
                nome = rs.getString(1);
            } else {
                nome = "";
            }
            
            this.desconectar(this.conexao);
            return nome;
        } catch (SQLException ex) {
            System.out.println(ex);
            return nome;
        }
    }
    
    public int findQuantidadeById(int id) {
        String sql = "SELECT estoque FROM produto WHERE id = ?";
        int quantidade = 0;
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if(rs.next()) {
                quantidade = rs.getInt(1);
            }
            
            this.desconectar(this.conexao);
            return quantidade;
        } catch (SQLException ex) {
            System.out.println(ex);
            return quantidade;
        }
    }
    
    public double findPrecoById(int id) {
        String sql = "SELECT preco FROM produto WHERE id = ?";
        double preco = 0;
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if(rs.next()) {
                preco = rs.getDouble(1);
            }
            
            this.desconectar(this.conexao);
            return preco;
        } catch (SQLException ex) {
            System.out.println(ex);
            return preco;
        }
    }
    
    public boolean findIdById(int id){
        String sql = "SELECT id from produto where id = ?";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if(rs.next()) return true;

            this.desconectar(this.conexao);
            return false;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    public boolean existeById(int id) {
        String sql = "SELECT nome FROM produto WHERE id = ?";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            return rs.next();
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        } finally {
            this.desconectar(this.conexao);
        }
    }
    
    public TableModel findProdutoByName(String name) {
        String sql = "SELECT id as \"ID\", nome as \"Nome\", descricao as \"Descrição\", "
                + "preco as \"Preço\", estoque as \"Estoque\" FROM produto WHERE nome LIKE ?";
        TableModel tb = null;

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, name + "%");
            rs = pst.executeQuery();
            tb = DbUtils.resultSetToTableModel(rs);
            this.desconectar(this.conexao);
            return tb;
        } catch (SQLException ex) {
            System.out.println(ex);
            return tb;
        }
    }
}