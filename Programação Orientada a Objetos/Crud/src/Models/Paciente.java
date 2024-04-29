package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Paciente extends DAO {
    private String nome, cpf, genero;
    private int idade;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private ArrayList<Paciente> pacientes;
    
    public Paciente() {}
    
    public Paciente(String nome, int idade, String cpf, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.genero = genero;
    }
    
    public TableModel findByName(String busca) {
        String sql = "select * from paciente where nome like ?";
        TableModel tb = null;
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, busca + "%");
            rs = pst.executeQuery();
            tb = DbUtils.resultSetToTableModel(rs);
            this.desconectar(this.conexao);
            return tb;
        } catch (SQLException ex) {
            System.out.println(ex);
            return tb;
        }
    }
    
    public TableModel all() {
        String sql = "select * from paciente";
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
    
    public TableModel findConsultaById(String id) {
        String sql = "select consulta.dia from consulta, paciente where paciente.id = consulta.pacienteId and pacienteId = ?";
        TableModel tb = null;

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            tb = DbUtils.resultSetToTableModel(rs);
            this.desconectar(this.conexao);
            return tb;
        } catch (SQLException ex) {
            System.out.println(ex);
            return tb;
        }
    }
    
    public String findNameById(String id) {
        String sql = "select nome from paciente where id = ?";
        String nome = "";
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, id);
            rs = pst.executeQuery();
            
            if(rs.next())
                nome = rs.getString(1);
            
            this.desconectar(this.conexao);
            return nome;
        } catch (SQLException ex) {
            System.out.println(ex);
            return nome;
        }
    }
    
    public boolean save() {
        String sql = "insert into paciente(nome, idade, cpf, genero) values(?, ?, ?, ?)";

        try {
            this.conectar();
            setPst(this.conexao.prepareStatement(sql));
            getPst().setString(1, getNome());
            getPst().setInt(2, getIdade());
            getPst().setString(3, getCpf());
            getPst().setString(4, getGenero());
            getPst().executeUpdate();
            System.out.println("Paciente cadastrado com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    public boolean update(String nome, int idade, String cpf, String genero, int id) {
        String sql = "update paciente set nome=?, idade=?, cpf=?, genero=? where id=?";
        
        try {
            this.conectar();
            setPst(this.conexao.prepareStatement(sql));
            getPst().setString(1, nome);
            getPst().setInt(2, idade);
            getPst().setString(3, cpf);
            getPst().setString(4, genero);
            getPst().setInt(5, id);
            getPst().executeUpdate();
            System.out.println("Paciente editado com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    public boolean destroy(String id) {
        String sql = "delete from paciente where id=?";
        
        try {
            this.conectar();
            setPst(this.conexao.prepareStatement(sql));
            getPst().setInt(1, Integer.parseInt(id));
            getPst().executeUpdate();
            System.out.println("Paciente excluído com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the pst
     */
    public PreparedStatement getPst() {
        return pst;
    }

    /**
     * @param pst the pst to set
     */
    public void setPst(PreparedStatement pst) {
        this.pst = pst;
    }

    /**
     * @return the rs
     */
    public ResultSet getRs() {
        return rs;
    }

    /**
     * @param rs the rs to set
     */
    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    /**
     * @return the pacientes
     */
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    /**
     * @param pacientes the pacientes to set
     */
    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
