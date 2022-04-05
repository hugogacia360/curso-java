package aula16e17;
import java.util.Scanner;

public class Exer19 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o numero de notas"); //entra com numero de notas q sera digitado
        int notas = scan.nextInt();
        double soma=0; double media; double nota;
        
        for(int i=0; i<notas; i++){
            System.out.println("Entre com a nota" + (i+1));
            nota = scan.nextDouble();
            soma +=nota; //soma incremental
        }
        media = soma/notas;
        System.out.println("soma :" + soma);
        System.out.println("soma :" + media);
    }
}
