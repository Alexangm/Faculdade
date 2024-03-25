package Automoveis;

public class Moto {
    private String nome, marca, cor, tipo;
    private int cilindrada;
    private double preco;
    
    public Moto(){}
    
    public Moto(String nome, String marca, String cor, int cilindrada, String tipo, double preco){
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.preco = preco;
    }

    public void valor(int parcelas){
        
        switch (parcelas) {
            case 24:
                {
                    double novoPreco = preco * 1.35;
                    detalhes();
                    System.out.println("Valor parcelado em 24 vezes = " + novoPreco);
                    System.out.println("Cada uma das 24 parcelas terá um valor de $" + String.format("%.2f", novoPreco/24));
                    break;
                }
            case 36:
                {
                    double novoPreco = preco * 1.5;
                    detalhes();
                    System.out.println("Valor parcelado em 36 vezes = " + novoPreco);
                    System.out.println("Cada uma das 36 parcelas terá um valor de $" + String.format("%.2f", novoPreco/36));
                    break;
                }
            case 48:
                {
                    double novoPreco = preco * 1.7;
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
        System.out.println("Nome = " + nome + "\nMarca = " + marca + "\nCor = " + cor);
        System.out.println("Tipo = " + tipo + "\nCilindrada = " + cilindrada);
        System.out.println("Preço = " + preco);
    }

}