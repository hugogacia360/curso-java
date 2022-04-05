package aula19;
import java.util.Scanner;

public class Exer30 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int vetorA[] = new int [20], vetorB[] = new int[vetorA.length], vetorC[] = new int[vetorA.length];
        
        for(int i=0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição " +i+" do primeiro vetor");
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 ==0){
                vetorB[i] = vetorA[i];
            }
            else if (vetorA[i] % 2 ==1){
                vetorC[i] = vetorA[i];
            }
        }
        
        System.out.print("O vetor de pares e \n");
        for(int i=0; i < vetorB.length; i++){
            if(vetorB[i] != 0){
            System.out.print(vetorB[i] +" ");
            }
        }
        System.out.println();
        System.out.print("O vetor de impares e \n");
        for(int i=0; i < vetorC.length; i++){
            if(vetorC[i] != 0){
            System.out.print(vetorC[i] +" ");
            }
        }
    
    }
    
}
