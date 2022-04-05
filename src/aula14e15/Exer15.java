package aula14e15;
import java.util.Scanner;

public class Exer15 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triangulo");
        double lado1 = scan.nextDouble();
        System.out.println("Digite o segundo lado do triangulo");
        double lado2 = scan.nextDouble();
        System.out.println("Digite o terceiro lado do triangulo");
        double lado3 = scan.nextDouble();
        
        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1)
      {

        if(lado1 == lado2 && lado2 == lado3)
        {
            System.out.println("O triangulo e equilatero");
        }
        if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
        {
            System.out.println("O triangulo e Isósceles");
        }
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
        {
            System.out.println("O triangulo e escaleno");
        }
      } else System.out.println("Nao e um triangulo");
        
    }
}
