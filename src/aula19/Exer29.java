package aula19;
import java.util.Scanner;

public class Exer29 {
    public static void main(String[]args){
       Scanner scan = new Scanner(System.in); 
       int vetorA[] = new int[10], vetorB[] = new int[10], vetorC[] = new int [20];
       
       for(int i=0; i < vetorA.length; i++){
           System.out.println("Digite um valor na posição " +i+ " do primeiro vetor");
           vetorA[i] = scan.nextInt();
       }
       
       for(int i=0; i < vetorB.length; i++){
           System.out.println("Digite um valor na posição " +i+ " do segundo vetor");
           vetorB[i] = scan.nextInt();
       }
       
       for(int i=0; i < vetorC.length; i++){
           if( i < 10){
               vetorC[i] = vetorA[i];
           }
           if( i >= 10){
               vetorC[i] = vetorB[ i - vetorA.length ];
           }
       }
       
       for(int i = 0; i < vetorC.length; i++){
           System.out.println(vetorC[i]);
       }
       
    }
    
}
