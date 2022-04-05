package aula16e17;
import java.util.Scanner;

public class Exer20 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int soma =0;
        
        System.out.println("Entre com a quantidade de idades");
        int idades = scan.nextInt();
        for(int i=0; i<idades; i++){
            System.out.println("Entre com a idade da pessoa" + (i+1));
            int idade = scan.nextInt();
            soma += idade;
           
        }
        double media = soma/idades;
        System.out.println("A media de idade e " + media);
        if(media >=0 && media <=25){
            System.out.println("jovem");
        }
        else if(media >=25 && media <=60){
            System.out.println("Adulta");
        }
        else if(media >60){
            System.out.println("Idosa");
        }
    }
}
