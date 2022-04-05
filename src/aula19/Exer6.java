package aula19;
import java.util.Scanner;


public class Exer6 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int vetorC[] = new int[10];
        
        for (int i =0; i < vetorA.length; i++){
        System.out.println("Digite o valor da posição " + (i+1) + " do primeiro vetor" );
        vetorA[i] = scan.nextInt();
        }
        
        for(int i=0; i < vetorB.length; i++){
        System.out.println("Digite o valor da posição " + (i+1) + " do segundo vetor");
        vetorB[i] = scan.nextInt();
        }
        System.out.println("A soma dos vetores e ");
        for(int i =0; i < vetorA.length; i++){
        vetorC[i] = (vetorA[i] + vetorB[i]);    
        System.out.println(vetorC[i]);
        }
    }
}
