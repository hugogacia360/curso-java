
package aula19;
import java.util.Scanner;

public class Exer15 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int [10], par=0, impar=0, percentPar=0, percentImpar=0;
        
        for(int i =0; i < vetorA.length; i++){
            System.out.println("Digite um valor para posição " +i+ " do vetor");
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 == 0){
                par++;  
            }
            else {
                impar ++;   
            }
        }
        percentPar = (par *100) / vetorA.length;
        percentImpar = (impar * 100) / vetorA.length;
        System.out.println("A percentegem de pares e " +percentPar+ "%");
        System.out.println("A percentegem de impares e " +percentImpar+"%");       
  
    }  
}
