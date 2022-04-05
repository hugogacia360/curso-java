
package aula14e15;
import java.util.Scanner;

public class Exer7 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo numero");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceito numero");
        double num3 = scan.nextDouble();
        //verificando qual e o maior numero
        if(num1>= num2 && num1>= num3)
        {
            System.out.println("O primeiro numero e maior");
        }
        if(num2>= num1 && num2>= num3)
        {
            System.out.println("O segundo numero e maior");
        }
        if(num3>= num1 && num3>= num2)
        {
            System.out.println("O terceiro numero e maior");
        }
        //verificando qual e o menor numero
        if(num1<= num2 && num1<= num3)
        {
            System.out.println("O primeiro numero e menor");
        }
        if(num2<= num1 && num2<= num3)
        {
            System.out.println("O segundo numero e menor");
        }
        if(num3<= num1 && num3<= num2)
        {
            System.out.println("O terceiro numero e menor");
        }
        
    
    }

}
