package aula19;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int [8];
        int vetorB[] = new int[8];
        
        for(int i=0; i<8; i++){
        System.out.println("Digite o valor da posição " +i);
        vetorA[i] = scan.nextInt();
        vetorB[i] = vetorA[i] *2;
        }
        System.out.println("O vetor multiplicado por 2 e :");
        for(int i=0; i<8; i++){
        System.out.println(vetorB[i]);
        
        }
    }
}

