package aula16e17;
import java.util.Scanner;

public class Exer18 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um numero inteiro");
        int num = scan.nextInt();
        boolean primo = true;
        
        for(int i=2;i<num; i++){
            if(num%i==0){
                System.out.println("Nao e primo");
                primo = false;
                break;
                
            }
        }
        if(primo){
            System.out.println("E um numero primo");
        }
}
}
