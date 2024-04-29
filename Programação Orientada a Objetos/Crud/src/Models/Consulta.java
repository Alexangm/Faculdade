package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Consulta extends DAO {
    private String dia;
    private int id;
    private Paciente paciente;
    private ArrayList<Consulta> consultas;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    public Consulta() {
        consultas = new ArrayList();
    }
    
    public Consulta(String dia, int id) {
        this.dia = dia;
        this.id = id;
        consultas = new ArrayList();
    }
    
    public TableModel all() {
        String sql = "select * from consulta";
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
    
    public ArrayList<String> findPacienteById(int id) {
        String sql = "select paciente.* from paciente, consulta where paciente.id = consulta.pacienteId and pacienteId = ?";
        ArrayList<String> lista = null;

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                lista.add(String.valueOf(rs.getInt(0)));
                lista.add(rs.getString(1));
                lista.add(String.valueOf(rs.getInt(2)));
                lista.add(rs.getString(3));
                lista.add(rs.getString(4));
            }
            
            this.desconectar(this.conexao);
            return lista;
        } catch (SQLException ex) {
            System.out.println(ex);
            return lista;
        }
    }
    
    public boolean save() {
        String sql = "insert into consulta(pacienteId, dia) values(?, ?)";

        try {
            this.conectar();
            setPst(this.conexao.prepareStatement(sql));
            getPst().setInt(2, getId());
            getPst().setString(3, getDia());
            getPst().executeUpdate();
            System.out.println("Consulta cadastrada com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    public boolean update(String dia, String id) {
        String sql = "update consulta set dia=? where pacienteId=?";
        
        try {
            this.conectar();
            setPst(this.conexao.prepareStatement(sql));
            getPst().setString(3, dia);
            getPst().setInt(2, Integer.parseInt(id));
            getPst().executeUpdate();
            System.out.println("Consulta editada com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    public boolean destroy(String id) {
        String sql = "delete from consulta where pacienteId = ?";
        
        try {
            this.conectar();
            setPst(this.conexao.prepareStatement(sql));
            getPst().setInt(1, Integer.parseInt(id));
            getPst().executeUpdate();
            System.out.println("Consulta excluída com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
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
    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }
    
    /**
     * @param consultas the consultas to set
     */
    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    /**
     * @return the data
     */
    public String getData() {
        return dia;
    }

    /**
     * @param data the data to set
     */
    public void setData(String dia) {
        this.dia = dia;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }
    
}
