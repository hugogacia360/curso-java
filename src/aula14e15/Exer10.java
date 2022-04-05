package aula14e15;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o turno que voce estuda M-matutino, V-Vespertino, N-Noturno");
        String turno = scan.nextLine();
        
        if(turno.equalsIgnoreCase("M"))
        {
            System.out.println("Bom dia");
        }
        if(turno.equalsIgnoreCase("V"))
        {
            System.out.println("Boa tarde");
        }
        if(turno.equalsIgnoreCase("N"))
        {
            System.out.println("Boa Noite");
        }
        
        
    }
}
