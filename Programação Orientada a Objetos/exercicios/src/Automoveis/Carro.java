package Automoveis;

public class Carro {
    private String nome, marca, motor, cor;
    private int qtdPortas;
    private double preco;

    public Carro(){}

    public Carro(String nome, String marca, String motor, String cor, int qtdPortas, double preco){
        this.nome = nome;
        this.marca = marca;
        this.motor = motor;
        this.cor = cor;
        this.qtdPortas = qtdPortas;
        this.preco = preco;
    }

    public void valor(int parcelas){
        switch (parcelas) {
            case 24:
                {
                    double novoPreco = preco * 1.3;
                    detalhes();
                    System.out.println("Valor parcelado em 24 vezes = " + novoPreco);
                    System.out.println("Cada uma das 24 parcelas terá um valor de $" + String.format("%.2f", novoPreco/24));
                    break;
                }
            case 36:
                {
                    double novoPreco = preco * 1.45;
                    detalhes();
                    System.out.println("Valor parcelado em 36 vezes = " + novoPreco);
                    System.out.println("Cada uma das 36 parcelas terá um valor de $" + String.format("%.2f", novoPreco/36));
                    break;
                }
            case 48:
                {
                    double novoPreco = preco * 1.6;
                    detalhes();
                    System.out.println("Valor parcelado em 48 vezes = " + novoPreco);
                    System.out.println("Cada uma das 48 parcelas terá um valor de " + String.format("%.2f", novoPreco/48));
                    break;
                }
            default:
                System.out.println("Não há financiamento para esse número de parcelas");
                break;
        }
    }

    public void detalhes(){
        System.out.println("Nome = " + nome + "\nMarca = " + marca + "\nMotor = " + motor);
        System.out.println("Cor = " + cor + "\nQuantidade de portas = " + qtdPortas);
        System.out.println("Preco = " + preco);
    }
    
    public String getNome(){
    return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMotor(){
        return motor;
    }

    public void setMotor(String motor){
        this.motor = motor;
    }

    public String getCor(){
        return cor;
}

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getQtdPortas(){
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas){
        this.qtdPortas = qtdPortas;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
}