package aula16e17;
import java.util.Scanner;

public class Exer28 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero para determinar se e primo");
        int num = scan.nextInt();
        
        if(num%2 == 0){
            System.out.println("O numero nao e primo");
        }
        else System.out.println("O numero e primo");
        
        
    }
}
