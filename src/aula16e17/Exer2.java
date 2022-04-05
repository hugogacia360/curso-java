package aula16e17;
import java.util.Scanner;

public class Exer2 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        boolean i=true;
        
        while(i==true){
        System.out.println("Digite seu nome");
        String nome = scan.nextLine();
        System.out.println("Digite uma senha");
        String senha = scan.nextLine();
        
        if(nome.equalsIgnoreCase(senha)){
            System.out.println("Erro! A senha nao pode ser igual a nome");
        }
        else {
            System.out.println("Senha e nome sao validos");
            i = false;
        }
        
      }
        
        
    }
}
