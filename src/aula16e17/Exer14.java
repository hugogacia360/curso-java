package aula16e17;
import java.util.Scanner;

public class Exer14 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        
        for(int i=0; i<10; i++){
        System.out.println("Digite um numero inteiro");
        num[i] = scan.nextInt();
        }
        for(int i=0; i<10; i++){
            if(num[i]%2 ==0){
                System.out.println("O numero " + num[i] +" e par");
            }
            else {
                System.out.println("O numero " + num[i] +" e impar");
            }
        }
    }
}
