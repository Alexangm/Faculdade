package Classes;

public class PessoaJuridica extends Cliente{
    private String cnpj, dataFund;

    public PessoaJuridica(){}
    
    public PessoaJuridica(String nome, String cnpj, int contaCliente){
        super(nome, contaCliente);
        this.cnpj = cnpj;
    }
    
    public PessoaJuridica(String nome, String cnpj, String dataFund, String end, int contaCliente, double saldo){
        super(nome, end, contaCliente, saldo);
        this.cnpj = cnpj;
        this.dataFund = dataFund;
    }

    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getDataFund(){
        return dataFund;
    }

    public void setDataFund(String dataFund){
        this.dataFund = dataFund;
    }
    
}