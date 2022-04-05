package aula19;
import java.util.Scanner;

public class Exer25 {
    public static void main(String[]args){
        int vetorA[] = new int [10], vetorB[] = new int[10];
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição " +i+ " do vetor");
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 == 0){ //par
                vetorB[i] = 1;
            }
            if(vetorA[i] % 2 == 1) { //impar
                vetorB[i] = 0;
            }
        }
        for(int i=0; i < vetorB.length; i++){
            System.out.println(vetorB[i]);
        }
        
    }
}
