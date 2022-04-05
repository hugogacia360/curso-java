package aula19;
import java.util.Scanner;

public class Exer12 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int vetorA[] = new int[10];
        int soma=0;
        
        for( int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição " +(i)+ " do vetor");
            vetorA[i] = scan.nextInt();
            soma += vetorA[i];      
            
        }
        System.out.println("A soma das posições do vetor e " +soma);
        
        
    }
}
