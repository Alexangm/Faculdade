package Triangulos;

public class TrianguloInvertido{
    public TrianguloInvertido(){}
    
    public void desenharTriangulo(int qtdLinhas){
        for(int i=qtdLinhas;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
        System.out.println("");
        }
    }
    
}