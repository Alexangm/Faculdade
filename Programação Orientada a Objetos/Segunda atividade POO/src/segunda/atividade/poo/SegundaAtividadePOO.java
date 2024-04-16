package segunda.atividade.poo;

import Classes.Cliente;
import Classes.PessoaFisica;
import Classes.PessoaJuridica;
import java.util.Scanner;

public class SegundaAtividadePOO {

    public static void main(String[] args) {
        
        int op, conta;
        double dinheiro;

        Cliente clientes[] = new Cliente[6];
        PessoaFisica pf[] = new PessoaFisica[3];
        PessoaJuridica pj[] = new PessoaJuridica[6];

        pf[0] = new PessoaFisica();
        pf[0].setNome("Yajirobe");
        pf[0].setCpf("123.123.123-34");
        pf[0].setContaCliente(1000);

        pf[1] = new PessoaFisica("Tenshinhan", "132.456.789-10", 2313);
        pf[2] = new PessoaFisica("Sobron", "987.654.321-01", 30, "Rua dos Anjos", 1337, 100000);

        pj[0] = new PessoaJuridica();
        pj[0].setNome("Empresa Wayne");
        pj[0].setCnpj("99.888.777/6666-55");
        pj[0].setContaCliente(4567);

        pj[1] = new PessoaJuridica("Corporação Cápsula", "22.333.333/4444-22", 2144);
        pj[2] = new PessoaJuridica("Corporações Kaiba", "11.222.222/3333-44", "10/12/1987", "Perto do Yugi", 3000, 800000.50);

        clientes[0] = pj[0];
        clientes[1] = pf[0];
        clientes[2] = pj[1];
        clientes[3] = pf[1];
        clientes[4] = pj[2];
        clientes[5] = pf[2];

        System.out.println("\t\t\tSeja bem vindo ao Banco Prejuízo!!!");

        do{
            System.out.println("Conta logada: " + pf[2].getNome() + "\tNúmero: " + pf[2].getContaCliente());
            System.out.println("\n\nPressione 1 para fazer um saque");
            System.out.println("Pressione 2 para verificar o saldo\nPressione 3 para fazer um deposito em uma conta");
            System.out.println("Pressione 4 para fazer uma transferência\n\nPressione 0 para fazer logout e encerrar o atendimento");

            Scanner scan = new Scanner(System.in);
            op = scan.nextInt();

            switch (op){
                case 1:
                    System.out.println("Saldo atual da conta: " + String.format("%.2f",pf[2].getSaldo()));
                    System.out.print("Digite o valor a ser sacado:  ");
                    dinheiro = scan.nextDouble();
                    pf[2].sacarDinheiro(dinheiro);
                    break;
                case 2:
                    System.out.println("Saldo atual da conta: " + String.format("%.2f",pf[2].getSaldo()));
                    break;
                case 3:
                    System.out.print("Digite o valor a ser depositado: ");
                    dinheiro = scan.nextDouble();
                    System.out.print("Digite o número da conta a receber o valor: ");
                    conta = scan.nextInt();
                    pf[2].depositar(dinheiro, conta, clientes);
                    break;
                case 4:
                    System.out.println("Saldo atual da conta: " + String.format("%.2f",pf[2].getSaldo()));
                    System.out.print("Digite o valor a ser transferido:  ");
                    dinheiro = scan.nextDouble();
                    System.out.print("Digite o número da conta a receber o valor: ");
                    conta = scan.nextInt();
                    pf[2].transferir(dinheiro, conta, clientes);
                    break;
                case 0:
                    System.out.println("O atendimento está encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(op!=0);
    }   
}