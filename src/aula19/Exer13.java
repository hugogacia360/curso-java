package aula19;
import java.util.Scanner;

public class Exer13 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[10];
        int soma=0;
        
        for(int i = 0; i < vetorA.length; i++){
        System.out.println("Digite o valor do vetor na posição " +i);
        vetorA[i] = scan.nextInt();
            if(vetorA[i] % 5 == 0 ){
            soma += vetorA[i];      
            }
    
        }
        System.out.println("A soma dos multiplos de 5 e " +soma);
   
    }       
    
 }
