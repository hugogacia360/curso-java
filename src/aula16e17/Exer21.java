package aula16e17;
import java.util.Scanner;


public class Exer21 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com numero de turmas");
        int turmas = scan.nextInt();
        int totalAlunos = 0;
        int alunos;
        boolean invalido = true;

        for(int i=0; i<turmas; i++){
            invalido = true;
            do{
            System.out.println("Digite o numero de alunos da turma " + (i+1));
            alunos = scan.nextInt();
            if(alunos <=40){
                invalido = false;
            }
            else{
                System.out.println("O numero de alunos e invalido");
            }
            } while(invalido); 
            
            totalAlunos += alunos;
        }
        double media = totalAlunos/turmas;
        System.out.println("O numero de alunos por turma e " + media);
    }
}
