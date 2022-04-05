package aula19;
import java.util.Scanner;

public class Exer33 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int [10];
        
        for(int i =0; i <vetorA.length; i++){
            System.out.println("Digite o valor da posição " +i+ " do vetor");
            vetorA[i] = scan.nextInt();
        }
        
        for(int i =0; i <vetorA.length; i++){
           boolean primo = true;
           for(int j =2; j < vetorA[i]; j++){
               if(vetorA[i] % j == 0){ //numero nao e primo
                   primo = false;
                   break;
               }
           }
           
           String msg = "";
           if (primo){
               msg = "primo";
           }else msg = "nao e primo";
           
           System.out.println(vetorA[i] + msg);
           
        }
        
    }
}
