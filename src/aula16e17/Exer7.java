package aula16e17;
import java.util.Scanner;

public class Exer7 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int num;
        
        for(int i=0; i<5; i++){
        System.out.println("Digite um numero");
        num = scan.nextInt();
        
        if(num >= maior){
            maior = num;
        }
    }
        System.out.println("O maior numero e " + maior);
}
}
