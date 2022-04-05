
package aula14e15;
import java.util.Scanner;

public class Exer4 {
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra do alfabeto");
        String letra = scan.nextLine();
        
        switch(letra)
        {
            case "a": System.out.println("E uma vogal"); break;
            case "e": System.out.println("E uma vogal"); break;
            case "i": System.out.println("E uma vogal"); break;      
            case "o": System.out.println("E uma vogal"); break;
            case "u": System.out.println("E uma vogal"); break;
            case "A": System.out.println("E uma vogal"); break;
            case "E": System.out.println("E uma vogal"); break;
            case "I": System.out.println("E uma vogal"); break;      
            case "O": System.out.println("E uma vogal"); break;
            case "U": System.out.println("E uma vogal"); break;
            default : System.out.println("E uma consoante"); break;    
        }       
        
    }
}
