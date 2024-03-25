package exercicio;

import Automoveis.Carro;
import Automoveis.Moto;
import java.util.Scanner;

public class Exercicio1e2 {
    public static void main(String[] args) {
    
        System.out.println("Qual tipo de veículo deseja financiar?");
        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();

        if(op>2){
            System.out.println("Opção Inválida!");
            System.exit(0);
        }
        if(op==1) System.out.println("Informe as informações do carro:");
        else System.out.println("Informe as informações da moto:");
        
        scan.nextLine();
        
        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.print("Marca: ");
        String marca = scan.nextLine();

        System.out.print("Cor: ");
        String cor = scan.nextLine();
        
        if(op==1){
            System.out.print("Potência do motor: ");
            String motor = scan.nextLine();

            System.out.print("Quantidade de portas: ");
            int qtdPortas = scan.nextInt();
            
            System.out.print("Valor: ");
            double preco = scan.nextDouble();

            System.out.println("Por quantas parcelas será financiado?");
            System.out.println("Opções : 24, 36, 48");
            
            int parcela = scan.nextInt();
            
            Carro c = new Carro(nome, marca, motor, cor, qtdPortas, preco);
            
            c.valor(parcela);  
            
        }else if(op==2){
            System.out.print("Cilindro: ");
            int cilindrada = scan.nextInt();
            scan.nextLine();
            
            System.out.print("Tipo: ");
            String tipo = scan.nextLine();
            
            System.out.print("Valor: ");
            double preco = scan.nextDouble();

            System.out.println("Por quantas parcelas será financiado?");
            System.out.println("Opções : 24, 36, 48");
            int parcela = scan.nextInt();
            
            Moto m = new Moto(nome, marca, cor, cilindrada, tipo, preco);
            m.valor(parcela);         
        }            
    }
}