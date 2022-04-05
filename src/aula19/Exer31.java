package aula19;
import java.util.Scanner;

public class Exer31 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int [20], vetorB[] = new int [vetorA.length];
        int count=0;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor na posição " +i+ " do vetor");
            vetorA[i] = scan.nextInt();
            
                if(vetorA[i] % 2 == 0 ){
                    vetorB[count] = vetorA[i];
                    count++;
                }   

        }   
            
        for(int i= 0; i < vetorA.length; i++){
                    if(vetorA[i] % 2 == 1){
                    vetorB[count] = vetorA[i];
                    count++;
                }
                    }
            
        
                     System.out.print("O resultado e \n");
        for(int i =0; i <vetorB.length; i++){
                    System.out.print(vetorB[i] + " ");
        }
        
    }
}
