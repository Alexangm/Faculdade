package Triangulos;

public class Triangulo{
    public Triangulo(){}
    
    public void desenharTriangulo(int qtdLinhas){
        for(int i=1;i<=qtdLinhas;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
        System.out.println("");
        }
    }
    
}