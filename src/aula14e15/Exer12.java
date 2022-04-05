package aula14e15;
import java.util.Scanner;

public class Exer12 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da sua hora de trabalho");
        double valorHora = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mes");
        double mesHora = scan.nextDouble();
        double salarioBruto = (valorHora*mesHora);
        
        if(salarioBruto < 900)
        {
            double inss = (salarioBruto*0.10);
            double fgts = (salarioBruto*0.11);
            double descontoTotal = (inss + fgts);
            double salarioLiquido = (salarioBruto - descontoTotal);
            System.out.printf("O salario bruto e %.2f\nINSS %.2f\nFGTS %.2f\nTotal de descontos %.2f\n"
             + "Salario liquido %.2f\n", salarioBruto, inss, fgts, descontoTotal, salarioLiquido);
        }
        if(salarioBruto > 900 && salarioBruto <= 1500)
        {
            double ir = (salarioBruto*0.05);
            double inss = (salarioBruto*0.10);
            double fgts = (salarioBruto*0.11);
            double descontoTotal = (inss + fgts);
            double salarioLiquido = (salarioBruto - descontoTotal);
            System.out.printf("O salario bruto e %f\nIR %f\nINSS %f\nFGTS %f\nTotal de descontos %f\n"
                + "Salario liquido %f\n", salarioBruto,ir, inss, fgts, descontoTotal, salarioLiquido);
        }
        if(salarioBruto > 1500 && salarioBruto <= 2500)
        {
            double ir = (salarioBruto*0.10);
            double inss = (salarioBruto*0.10);
            double fgts = (salarioBruto*0.11);
            double descontoTotal = (inss + fgts);
            double salarioLiquido = (salarioBruto - descontoTotal);
            System.out.printf("O salario bruto e %f\nIR %f\nINSS %f\nFGTS %f\nTotal de descontos %f\n"
                + "Salario liquido %f\n", salarioBruto,ir, inss, fgts, descontoTotal, salarioLiquido);
        }
        if(salarioBruto > 2500)
        {
            double ir = (salarioBruto*0.20);
            double inss = (salarioBruto*0.10);
            double fgts = (salarioBruto*0.11);
            double descontoTotal = (inss + fgts);
            double salarioLiquido = (salarioBruto - descontoTotal);
            System.out.printf("O salario bruto e %f\nIR %f\nINSS %f\nFGTS %f\nTotal de descontos %f\n"
                + "Salario liquido %f\n", salarioBruto,ir, inss, fgts, descontoTotal, salarioLiquido);
        }
        
    }

}
