package aula19;
import java.util.Scanner;


public class Exer1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int [5];
        int vetorB[] = new int[5];
        
        for(int i=0; i<5; i++){
        System.out.println("Digite o valor da posição " +i);
        vetorA[i] = scan.nextInt();
        vetorB[i] = vetorA[i];
        }
        
        for(int i=0; i<5; i++){
        System.out.println("O segundo vetor e " +vetorB[i]);
        
        }
    }
}
