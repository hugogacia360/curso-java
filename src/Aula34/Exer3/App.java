package Aula34.Exer3;

import java.util.Scanner;

public class App {
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      int num;
        
       do {
           System.out.println("Digite um número inteiro: ");
           num = scan.nextInt();
           if( num < 0){
                System.out.println("Número inválido!");
           }

       }while (num < 0);
       System.out.println(Fatorial.fatorialDoNumero(num));

       scan.close();
    }
    
}
