package exercicio;

import Triangulos.Triangulo;
import Triangulos.TrianguloInvertido;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        System.out.println("Qual tipo de triângulo você deseja imprimir?");
        System.out.println("1 - Triangulo");
        System.out.println("2 - Triangulo Invertido");
        Scanner s = new Scanner(System.in);
        int op = s.nextInt();
        
        System.out.print("Quantas linhas o triângulo terá?");
        int linhas = s.nextInt();
        
        switch (op) {
            case 1:
                Triangulo t1 = new Triangulo();
                t1.desenharTriangulo(linhas);
                break;
            case 2:
                TrianguloInvertido t2 = new TrianguloInvertido();
                t2.desenharTriangulo(linhas);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        } 
    }
}