package aula19;
import java.util.Scanner;

public class Exer11 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int vetorA[] = new int[10];
        int pares[] = new int [vetorA.length];
                
        for (int i = 0; i< vetorA.length; i++){
        System.out.println("Digite o valor da posição " +(i)+" do vetor");
        vetorA[i] = scan.nextInt();
        }
        System.out.println("O vetor dos numeros pares digitados sao ");
        for( int i = 0; i <vetorA.length; i++){
            if(vetorA[i] % 2 == 0) {
                pares[i] = vetorA[i];
                System.out.println(pares[i]);
            }
            
        }
        
        
        
    }
}
