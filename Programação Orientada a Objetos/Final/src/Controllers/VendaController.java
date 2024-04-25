package Controllers;

import Models.Venda;
import javax.swing.table.TableModel;

public class VendaController {
    
    /**
     * Selecionar a tabela "Venda" por inteiro
     * @return TableModel
     */
    public TableModel index() {
        return new Venda().all();
    }
    
    /**
     * Cadastra um venda_final na tabela carinho_compras
     * @return boolean
     */
    public boolean create(String cliente_id, String produto_id1, String produto_id2, String produto_id3, String produto_id4, String produto_id5,double valor) {
        return new Venda().save(cliente_id, produto_id1, produto_id2, produto_id3, produto_id4, produto_id5, valor);
    }
    
    /**
     * Recebendo por parâmetro um INTEGER id, deleta um venda_final específico
     * @return boolean
     */
    public boolean delete (int id) {
        return new Venda().destroy(id);
    }
    
    public TableModel findVendaByName (String name){
        return new Venda().findVendaByName(name);
    }
}
