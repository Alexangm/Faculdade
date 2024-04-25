package Controllers;

import Models.Cliente;
import java.util.ArrayList;
import javax.swing.table.TableModel;

public class ClienteController {
    
    /**
     * Selecionar a tabela por inteiro
     * @return TableModel
     */
    public TableModel index() {
        return new Cliente().all();
    }
    
    public boolean existeById(int id){
        return new Cliente().existeById(id);
    }
    
    public ArrayList findClienteById(int id) {
        return new Cliente().findClienteById(id);
    }
    
    public String findNomeById(int id) {
        return new Cliente().findNomeById(id);
    }
    
    public boolean findIdById(int id) {
        return new Cliente().findIdById(id);
    }
    
    public TableModel findClienteByName(String nome) {
        return new Cliente().findClienteByName(nome);
    }
    
    /**
     * Cadastra um cliente na tabela cliente
     * @return boolean
     */
    public boolean create(String nome, String sobrenome, String dataNascimento, String cpf, String genero, String email) {
        return new Cliente().save(nome, sobrenome, dataNascimento, cpf, genero, email);
    }
    
    /**
     * Edita todos os atributos de um Cliente, exceto a sua data de cadastro
     * @return boolean
     */
    public boolean edit (String nome, String sobrenome, String dataNascimento, String cpf, String genero, String email, int id) {
        return new Cliente().update(nome, sobrenome, dataNascimento, cpf, genero, email, id);
    }
    
    /**
     * Recebendo por parâmetro um INTEGER id, deleta um cliente específico
     * @return boolean
     */
    public boolean delete (int id) {
        return new Cliente().destroy(id);
    }
}
