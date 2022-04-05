package aula19;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[10];
        int vetorB[] = new int [10];
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição "+(i)+" do primeiro vetor");
            vetorA[i] = scan.nextInt();
        }
        System.out.println("O resto da divisao por 2 do primeiro vetor e ");
        for(int i = 0; i <vetorB.length; i++){
            vetorB[i] = vetorA[i] % 2;
            System.out.println(vetorB[i]);
        }
        
        
    }
}
