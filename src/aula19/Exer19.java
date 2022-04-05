package aula19;
import java.util.Scanner;

public class Exer19 {
    public static void main(String[]args){
        int nota1[] = new int[10], nota2[] = new int[10];
        double result[] = new double [10];
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i<10; i++){
            System.out.println("Digite a nota 1 do " +(i+1)+ "º aluno");
            nota1[i] = scan.nextInt(); 
        }
        for(int i=0; i<10; i++){
            System.out.println("Digite a nota 2 do " +(i+1)+ "º aluno");
            nota2[i] = scan.nextInt(); 
        }
        for(int i=0; i<10; i++){
            result[i] = (nota1[i] + nota2[i]) / 2;
        }
        for(int i=0; i<10; i++){
            if(result[i] >= 7){
                System.out.println("O " +(i+1)+ "º aluno foi aprovado. Sua media foi " +result[i]);
            }else System.out.println("O " +(i+1)+ "º aluno foi reprovado. Sua media foi "+result[i]);
    }
        
    }
}
