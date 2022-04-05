package aula19;
import java.util.Scanner;

public class Exer37 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int [15], vetorB[] = new int [15];
        
        for(int i =0; i < vetorA.length;i++){
            System.out.println("Digite o valor da posição " +i+ " do vetor");
            vetorA[i] = scan.nextInt();
   
        }
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = 1;
            for(int j = 1; j < vetorA[i]; j++){
                vetorB[i] *= j;
            }
        }
        
        System.out.println("O vetor fatorial e ");
        for( int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        
    }
}
