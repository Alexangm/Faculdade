package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Cliente extends DAO {   
    
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private final ArrayList cliente = new ArrayList();
    
    public Cliente() {}
        
    /**
     * Selecionar a tabela Cliente por inteira
     * @return TableModel
     */
    public TableModel all() {
        String sql = "SELECT id as \"ID\", nome as \"Nome\", sobrenome as \"Sobrenome\", "
                + "cpf as \"CPF\", date_format(data_nascimento, \"%d/%m/%Y\") as \"Data de Nascimento\", "
                + "genero as \"Gênero\", email as \"E-mail\", date_format(data_cadastro, \"%d/%m/%Y\") as \"Cadastrado em\" FROM cliente";
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
    
    public boolean existeById(int id) {
        String sql = "SELECT nome FROM cliente WHERE id = ?";
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if(rs.next()) {
                return true;
            }else return false;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        } finally {
            this.desconectar(this.conexao);
        }
    }
    
    public String findNomeById(int id) {
        String sql = "SELECT nome FROM cliente WHERE id = ?";
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
    
    public ArrayList findClienteById(int id) {
        String sql = "SELECT nome, sobrenome, cpf, date_format(data_nascimento, \"%d/%m/%Y\"), "
                + "genero, email FROM cliente WHERE id = ?";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if(rs.next()) {
                for(int i=1; i<7; i++) cliente.add(rs.getString(i));
            } else {
                for(int i=0; i<6; i++) cliente.add("");
            }
            
            this.desconectar(this.conexao);
            return cliente;
        } catch (SQLException ex) {
            System.out.println(ex);
            return cliente;
        }
    }
    
    public boolean findIdById(int id){
        String sql = "SELECT id from cliente where id = ?";

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
    
    public TableModel findClienteByName(String name) {
        String sql = "SELECT id as \"ID\", nome as \"Nome\", sobrenome as \"Sobrenome\", "
                + "cpf as \"CPF\", date_format(data_nascimento, \"%d/%m/%Y\") as \"Data de Nascimento\", "
                + "genero as \"Gênero\", email as \"E-mail\", date_format(data_cadastro, \"%d/%m/%Y\") as \"Cadastrado em\" FROM cliente WHERE nome LIKE ?";
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
    
    /**
     * Cadastra um cliente na tabela Cliente
     * @param nome
     * @param sobrenome
     * @param dataNascimento
     * @param cpf
     * @param genero
     * @param email
     * @return boolean
     */
    public boolean save(String nome, String sobrenome, String dataNascimento, String cpf, String genero, String email) {
        String sql = "INSERT INTO cliente (nome, sobrenome, data_nascimento, data_cadastro, cpf, genero, email) "
                + "VALUES(?, ?, STR_TO_DATE(?,\"%d/%m/%Y\"), curdate(), ?, ?, ?)";
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, sobrenome);
            pst.setString(3, dataNascimento);
            pst.setString(4, cpf);
            pst.setString(5, genero);
            pst.setString(6, email);
            pst.executeUpdate();
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    /**
     * Edita todos os atributos de um cliente pelo id, menos a data_cadastro
     * @param nome
     * @param sobrenome
     * @param dataNascimento
     * @param cpf
     * @param genero
     * @param email
     * @param id
     * @return boolean
     */
    public boolean update(String nome, String sobrenome, String dataNascimento, String cpf, String genero, String email, int id) {
        String sql = "UPDATE cliente "
                + "SET nome=?, sobrenome=?, data_nascimento=STR_TO_DATE(?,\"%d/%m/%Y\"), cpf=?, genero=?, email=?"
                + " WHERE id=?";
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, sobrenome);
            pst.setString(3, dataNascimento);
            pst.setString(4, cpf);
            pst.setString(5, genero);
            pst.setString(6, email);
            pst.setInt(7, id);
            pst.executeUpdate();
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    /**
     * Apaga um determinado cliente
     * @param id
     * @return boolean
     */
    public boolean destroy(int id) {
        String sql = "DELETE FROM cliente WHERE id=?";
        
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