package exercicio;

import Classes.Alunos;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        double nota;
        int falta;
        System.out.println("Qual o nome do aluno?");
        nome = scan.nextLine();
        System.out.println("Qual a nota final do aluno?");
        nota = scan.nextDouble();
        System.out.println("Quantas faltas ele tem?");
        falta = scan.nextInt();
       
        Alunos a = new Alunos(nome, nota, falta);
        a.relatorio();

    
    }
    
}