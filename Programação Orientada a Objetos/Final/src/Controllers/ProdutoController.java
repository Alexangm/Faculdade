package Controllers;

import Models.Produto;
import java.util.ArrayList;
import javax.swing.table.TableModel;

public class ProdutoController {
    
    /**
     * Selecionar a tabela "Produto" por inteiro
     * @return TableModel
     */
    public TableModel index() {
        return new Produto().all();
    }
    
    /**
     * Cadastra um produto na tabela produto
     * @return boolean
     */
    public boolean create(String nome, String descricao, double preco, int estoque) {
        return new Produto().save(nome, descricao, preco, estoque);
    }
    
    /**
     * Edita todos os atributos de um Produto
     * @return boolean
     */
    public boolean edit (String nome, String descricao, double preco, int estoque, int id) {
        return new Produto().update(nome, descricao, preco, estoque, id);
    }
    
    public boolean editEstoque (int mudanca, int id){
        return new Produto().updateEstoque(mudanca, id);
    }
    
    /**
     * Recebendo por parâmetro um INTEGER id, deleta um produto específico
     * @return boolean
     */
    public boolean delete (int id) {
        return new Produto().destroy(id);
    }
    
    public ArrayList findProdutoById(int id) {
        return new Produto().findProdutoById(id);
    }
    
    public double findPrecoById(int id) {
        return new Produto().findPrecoById(id);
    }
    
    public int findQuantidadeById(int id) {
        return new Produto().findQuantidadeById(id);
    }
    
    public String findNomeById(int id) {
        return new Produto().findNomeById(id);
    }
    
    public boolean findIdById(int id) {
        return new Produto().findIdById(id);
    }
    
    public boolean existeById(int id) {
        return new Produto().existeById(id);
    }
    
    public TableModel findProdutoByName(String nome) {
        return new Produto().findProdutoByName(nome);
    }
}
