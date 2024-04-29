package Controllers;

import Models.Consulta;
import Models.Paciente;
import java.util.ArrayList;
import javax.swing.table.TableModel;

public class ConsultaController {
    
    public TableModel index() {
        return new Consulta().all();
    }
    
    public ArrayList<String> findPacienteById (int id) {
        return new Consulta().findPacienteById(id);
    }
    
    public boolean create(String data, int id) {
        return new Consulta(data, id).save();
    }
    
    public boolean edit (String dia, String id) {
        return new Consulta().update(dia, id);
    }
    
    public boolean delete (String id) {
        return new Consulta().destroy(id);
    }
    
}
