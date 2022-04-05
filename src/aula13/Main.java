package aula13;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //exercicio 2
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = scan.nextInt();
        System.out.println("O numero digitado e " + num);
        //exercicio 4
        System.out.println("Digite a primeira nota");
        int nota1 = scan.nextInt();
        System.out.println("Digite a segunda nota");
        int nota2 = scan.nextInt();
        System.out.println("Digite a terceira nota");
        int nota3 = scan.nextInt();
        System.out.println("Digite a quarta nota");
        int nota4 = scan.nextInt();
        int notaFinal = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A media final e " + notaFinal);
        //exercicio 5
        System.out.println("Digite a distancia em metros");
        int metros = scan.nextInt();
        int centimetros = metros * 100;
        System.out.println("A distancia em centimetros e " + centimetros);
        //exercicio 8
        System.out.println("Digite quanto voce ganhar por hora");
        int salario = scan.nextInt();
        System.out.println("Digite quantas horas voce trabalha por mes");
        int horas = scan.nextInt();
        int salariomensal = salario * horas;
        System.out.println("Seu salario mensal e " + salariomensal);
        
    }
    
}
