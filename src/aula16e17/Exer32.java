package aula16e17;
import java.util.Scanner;

public class Exer32 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int i=0, cod, qtd;
        boolean naoTerminar = true;
        String output ="";
        
        do {
            System.out.println("Digite o codigo e a quantidade.Digite 0 0 para sair");
            cod = scan.nextInt();
            qtd = scan.nextInt();
            if(cod ==0 && qtd == 0){
                naoTerminar = false;
            }
            else {
                
            }
            
        } while(naoTerminar);
        
    }
}
