package aula14e15;
import java.util.Scanner;

public class Exer17 {
   public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Digite um ano");
       int ano = scan.nextInt();
       
       if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
           System.out.println("O ano e bissesto");              
       }
       else System.out.println("O ano nao e bissexto");    
       
   } 
}
