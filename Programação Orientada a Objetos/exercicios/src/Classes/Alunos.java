package Classes;

public class Alunos {
    private String nome;
    private double notaFinal;
    private int falta;

    public Alunos(){}
    
    public Alunos(String nome, double notaFinal, int falta){
        this.nome = nome;
        this.notaFinal = notaFinal;
        this.falta = falta;
    }
    
    public void relatorio(){
        if((notaFinal>=60)&&(falta<=25)){
            System.out.println(nome + " está aprovado(a).");
        }else if((notaFinal<60)&&(falta>25)){
            System.out.println(nome + " está reprovado(a), pois não atingiu os 60 pontos e possui mais de 25 faltas.");
        }else if(notaFinal<60){
            System.out.println(nome + " está reprovado(a), pois não atingiu os 60 pontos");
        }else{
            System.out.println(nome + " está reprovado(a), pois possui mais de 25 faltas");
        }
    }
}