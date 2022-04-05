package aula16e17;
import java.util.Scanner;

public class Exer4 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        long populacaoA; long populacaoB; double crescimentoA=80000;
        double crescimentoB=200000; int i=0;
        
        while(crescimentoA <= crescimentoB) {
        crescimentoA = crescimentoA + (crescimentoA*0.03);
        crescimentoB = crescimentoB + (crescimentoB*0.015);
        i++;
        }
        System.out.println("Ira demorar " + i + " anos para ultrapassar a população");
        System.out.println("Depois de " +i+ " anos a população A e " + crescimentoA);
        System.out.println("Depois de " +i+ " anos a população B e " + crescimentoB);
    }
}
