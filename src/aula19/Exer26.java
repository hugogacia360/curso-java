package aula19;
import java.util.Scanner;

public class Exer26 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int [10], vetorB[] = new int[10], vetorC[] = new int[10];
        
        for(int i = 0; i <vetorA.length; i++){
            System.out.println("Digite o valor da posição " +i+ " do primeiro vetor");
            vetorA[i] = scan.nextInt();
        }
        for(int i = 0; i <vetorB.length; i++){
            System.out.println("Digite o valor da posição " +i+ " do segundo vetor");
            vetorB[i] = scan.nextInt();
        }
        for(int i = 0; i <vetorA.length; i++){
            if(vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            }
            else if (vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            }
            else if (vetorA[i] < vetorB[i]){
                vetorC[i] = -1;
            }
        }
            System.out.println("O terceiro vetor e ");
        for( int i =0; i <vetorC.length; i++){
            System.out.println(vetorC[i]);
        }
        
        
        
    }
}
