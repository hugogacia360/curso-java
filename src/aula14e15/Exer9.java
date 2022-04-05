
package aula14e15;
import java.util.Scanner;

public class Exer9 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo numeor");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro numero");
        double num3 = scan.nextDouble();
        
        if (num2 <= num1 && num2 <=num3 && num2 <= num3)
        {
            System.out.println("A ordem descrescente e " + num1 + num3 + num2);
        }
        if (num1 <= num2 && num1 <=num3 && num1 <= num3)
        {
            System.out.println("A ordem descrescente e " + num2 + num3 + num1);
        }
        if (num2 <= num1 && num2 <=num3 && num2 <= num1)
        {
            System.out.println("A ordem descrescente e " + num3 + num1 + num2);
        }
        if (num3 <= num1 && num3 <=num2 && num3 <= num1)
        {
            System.out.println("A ordem descrescente e " + num2 + num1 + num3);
        }
        if (num3 <= num1 && num3 <=num2 && num3 <= num2)
        {
            System.out.println("A ordem descrescente e " + num1 + num2 + num3);
        }
        if (num1 <= num2 && num1 <=num3 && num1 <= num2)
        {
            System.out.println("A ordem descrescente e " + num3 + num2 + num1);
        }
        
    }
            

}
