package Classes;

public class Cliente {
    protected String nome, end;
    protected int contaCliente;
    protected double saldo;
    
    public Cliente(){}

    public Cliente(String nome, int contaCliente){
        this.nome = nome;
        this.contaCliente = contaCliente;
        saldo = 0;
        end = "Não cadastrado";
    }
    
    public Cliente(String nome, String end, int contaCliente, double saldo){
        this.nome = nome;
        this.end = end;
        this.contaCliente = contaCliente;
        this.saldo = saldo;
    }

    public void verificarSaldo(){
    System.out.println("Saldo atual: " + getSaldo());
    }
    
    public void sacarDinheiro(double saque){
        if (saldo < saque){
            System.out.println("Saldo insuficiente! A transação não pode ser concluída!");
        }else{
            saldo = saldo - saque;
            System.out.println(" " + saque +" foram retirados da sua conta. Saldo atual: " + String.format("%.2f", saldo));
        }
    }
    
    public void depositar(double valor, int contaDestino, Cliente clientes[]){
        for(int i=0; i<6; i++){
            if(contaDestino==clientes[i].contaCliente){
                clientes[i].saldo += valor;
                System.out.println("Valor depositado com sucesso.");
                return;
            }
        }
        System.out.println("Conta não encontrada!");
    }
    
    public void transferir(double valor, int contaDestino, Cliente clientes[]){
        if(contaDestino == contaCliente){
            System.out.println("A conta destino informada é a mesma conta a ser efetuada a transferência, portanto a operação foi invalidada!");
            return;
        }
        for(int i=0; i<6; i++){
            if(contaDestino==clientes[i].contaCliente){
                if(saldo >= valor){
                    clientes[i].saldo += valor;
                    saldo -= valor;
                    System.out.println("Valor transferido com sucesso.");
                    return;
                }else{
                    System.out.println("Saldo insuficiente!");
                    return;
                }
            }
        }
        System.out.println("Conta não encontrada!");
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEnd(){
        return end;
    }

    public void setEnd(String end){
        this.end = end;
    }
    
    public int getContaCliente(){
        return contaCliente;
    }

    public void setContaCliente(int contaCliente){
    this.contaCliente = contaCliente;
    }
    
    public double getSaldo(){
        return saldo;
}

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}