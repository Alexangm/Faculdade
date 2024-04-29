package Controllers;

import Models.Paciente;
import java.util.ArrayList;
import javax.swing.table.TableModel;

public class PacienteController {
    
    public TableModel index() {
        return new Paciente().all();
    }
    
    public TableModel findName(String busca) {
        return new Paciente().findByName(busca);
    }
    
    public String findNameById(String id) {
        return new Paciente().findNameById(id);
    }
    
    public TableModel findConsulta(String id) {
        return new Paciente().findConsultaById(id);
    }
    
    public boolean create(String nome, int idade, String cpf, String genero) {
        return new Paciente(nome, idade, cpf, genero).save();
    }
    
    public boolean edit (String nome, int idade, String cpf, String genero, int id) {
        return new Paciente().update(nome, idade, cpf, genero, id);
    }
    
    public boolean delete (String id) {
        return new Paciente().destroy(id);
    }
    
}