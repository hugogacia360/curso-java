package aula14e15;
import java.util.Scanner;

public class Exer18 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num = scan.nextInt();
        
        if (num%2 == 0){
        System.out.println("O numero e par");
        
    } else System.out.println("O numero impar");
        
    }
}
