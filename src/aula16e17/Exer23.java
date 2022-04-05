package aula16e17;
import java.util.Scanner;

public class Exer23 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
         double preco = 1.99;
         
        System.out.println("Lojas Quase doi - Tabela de preços"); 
        for(int i = 1; i<=50; i++){
        double tabela = preco*i;
        System.out.println( i +" - " + tabela);
        
        }
    
    }
}
