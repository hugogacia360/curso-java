package aula14e15;
import java.util.Scanner;

public class Exer19 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo nuemro");
        int num2 = scan.nextInt();
        System.out.println("Entre com a operação que deseja (+ - / *) ");
        String operacao = scan.next();
        double resultado = 0;
        
        switch(operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println(resultado);
                    break;
            case "-":
                resultado = num1 - num2;
                System.out.println(resultado);
                    break;
            case "/":
                resultado = num1 / num2;
                System.out.println(resultado);
                    break;
            case "*":
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            default : System.out.println("Operação invalida");
           
        }
        
        
    }
}
