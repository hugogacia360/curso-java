package aula16e17;
import java.util.Scanner;

public class Exer11 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero inteiro");
        int num1 = scan.nextInt();
         System.out.println("Digite o segundo numero inteiro");
        int num2 = scan.nextInt();
                  
        if(num1 < num2){
            num1++;
            while(num1 < num2){
                System.out.println(num1);
                num1++;
            }
        }            
        if (num2 < num1){
            num2++;
            while(num2< num1){
                System.out.println(num2);
                num2++;
            }
        }          
    }
}
