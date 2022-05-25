package aula14e15;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro entre 1 e 7");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("O dia e domingo");
                break;
            case 2:
                System.out.println("O dia e segunda");
                break;
            case 3:
                System.out.println("O dia e terça-feira");
                break;
            case 4:
                System.out.println("O dia e quarta-feira");
                break;
            case 5:
                System.out.println("O dia e quinta-feira");
                break;
            case 6:
                System.out.println("O dia e sexta-feira");
                break;
            case 7:
                System.out.println("O dia e sabado");
                break;
            default:
                System.out.println("Numero invalido");
        }

    }
}
