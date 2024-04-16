package Classes;

public class PessoaFisica extends Cliente{
    private String cpf;
    private int idade;
    
    public PessoaFisica(){}
    
    public PessoaFisica(String nome, String cpf, int contaCliente){
        super(nome, contaCliente);
        this.cpf = cpf;
    }
    
    public PessoaFisica(String nome, String cpf, int idade, String end, int contaCliente, double saldo){
        super(nome, end, contaCliente, saldo);
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
}