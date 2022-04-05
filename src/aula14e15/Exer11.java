package aula14e15;
import java.util.Scanner;

public class Exer11 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salario");
        double salario = scan.nextDouble();
        
        
        if(salario <= 280)
        {
            double aumento = (salario*0.20) + salario;
            System.out.println("O salario antes do reajuste era de " + salario 
                    + " O percentual aplicado e 20%. O valor do aumento e " + salario*0.20 + 
                    " O novo salario apos o aumento e " + aumento);
        }
        if(salario >= 700 && salario <= 1500)
        {
            double aumento = (salario*0.10) + salario;
            System.out.println("O salario antes do reajuste era de " + salario 
                    + " O percentual aplicado e 10%. O valor do aumento e " + salario*0.10 + 
                    " O novo salario apos o aumento e " + aumento);
        }
        if(salario > 1500)
        {
            double aumento = (salario*0.05) + salario;
            System.out.println("O salario antes do reajuste era de " + salario 
                    + " O percentual aplicado e 5%. O valor do aumento e " + salario*0.05 + 
                    " O novo salario apos o aumento e " + aumento);
        }
        
        
    }
}
