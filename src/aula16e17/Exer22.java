package aula16e17;
import java.util.Scanner;


public class Exer22 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double soma=0;
        
        System.out.println("Digite a quantidade de CDs");
        int cd = scan.nextInt();
        
        for(int i=0; i<cd; i++){
        System.out.println("Informe o valor de cada CD");
        double preco = scan.nextDouble();
        soma += preco;
        }
        double media = soma/cd;
        System.out.println("Media gasta com CD e " + media);
 
    }
}
