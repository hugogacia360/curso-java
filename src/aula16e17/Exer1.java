package aula16e17;
import java.util.Scanner;

public class Exer1 {
    public static void main(String[]args){
      Scanner scan = new Scanner(System.in);      
      int num;
      
      while (true){
      System.out.println("Digite um numero entre 0 e 10");
      num = scan.nextInt();
      if (num >=0 && num<=10){
          System.out.println("O numero e valido");
      }
      else System.out.println("Numero invalido");
      }
     
    }
}
