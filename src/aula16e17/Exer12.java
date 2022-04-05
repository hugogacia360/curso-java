package aula16e17;
import java.util.Scanner;

public class Exer12 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int tabuada =0;
        
        while(true){
        System.out.println("Digite qual numero da tabuada deseja");
        int num = scan.nextInt();
        if(num >= 1 && num<=10){
            for(int i=1; i<=num; i++){
            tabuada = i*num;
            System.out.println(num + " x " + i + " = " + tabuada);
            }  
        }else System.out.println("O numero precisa estar entre 1 e 10");
        }
    }
}
