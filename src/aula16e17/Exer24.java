package aula16e17;
import java.util.Scanner;


public class Exer24 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
         double preco = 0.18;
         
        System.out.println("Pães - Tabela de preços");
        for(int i = 1; i<=50; i++){
        double tabela = preco*i;
        System.out.println( i +" - " + tabela);
        
        }
        
    }
}
