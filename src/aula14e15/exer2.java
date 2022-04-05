
package aula14e15;

import java.util.Scanner;

public class exer2 {
    public static void main (String[]args){
    System.out.println("Digite um valor");
    Scanner scan = new Scanner(System.in);
    int valor = scan.nextInt();
    if(valor>=0)
    {
    System.out.println("O numero digitado e positivo");
    
    }
    else System.out.println("O numero e negativo");
}
}
