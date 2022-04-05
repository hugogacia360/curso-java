package aula19;
import java.util.Scanner;

public class Exer32 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int [5];
        
        for(int i=0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição " +i+ " do vetor");
            vetorA[i] = scan.nextInt();
        }
        
        for(int i=0; i < vetorA.length; i++){  //for para tabuada dos numeros digitados
            System.out.println("A tabuada de " +vetorA[i]);
            
            for( int j = 1; j <=10; j++){    //for para multiplacar de 1 a 10
                System.out.println( j + " * " + vetorA[i] + " = " + (vetorA[i]*j));
            }
            System.out.println();
        }
        
    }
}
