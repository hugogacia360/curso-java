package aula19;
import java.util.Scanner;

public class Exer5 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int [10];
        int vetorB[] = new int [10];
        
        for(int i=0; i < vetorA.length; i++){
        
        System.out.println("Digite o valor da posição " +i);
        vetorA[i] = scan.nextInt();
        vetorB[i] = vetorA[i] * i;
        
        }
        for (int i=0; i < vetorA.length; i++){
        System.out.println("O vetor B e " + vetorB[i]);
        }
   
    }
}
