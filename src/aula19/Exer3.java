package aula19;
import java.util.Scanner;


public class Exer3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int [15];
        int vetorB[] = new int[15];
        
        for(int i=0; i<15; i++){
        System.out.println("Digite o valor da posição " +i);
        vetorA[i] = scan.nextInt();
        vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.println("O vetor elevado ao quadrado e :");
        for(int i=0; i<15; i++){
        System.out.println(vetorB[i]);
        
        }
    }
}
