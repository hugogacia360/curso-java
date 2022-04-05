package aula16e17;
import java.util.Scanner;

public class Exer3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String nome; int i=0;
 
        do {
            System.out.println("Digite um nome");
            nome = scan.nextLine();
            if(nome.length() >=3){
                i = 1;
            }
            else {
                System.out.println("Nome precisa ter mais de 3 letras");
                
            }           
        }
            while(i==0);
        i = 0;
        do {
            System.out.println("Digite uma idade");
            int idade = scan.nextInt();
            if(idade >= 0 && idade <=150){
                i = 1;
            }
            else {
                System.out.println("Idade precisa ser entre 0 e 150");
                
            }           
        }
            while(i==0);
        i = 0;
        do {
            System.out.println("Digite o salario");
            double salario = scan.nextDouble();
            if(salario > 0){
                i = 1;
            }
            else {
                System.out.println("O salario tem que ser maior que 0");
                
            }           
        }
            while(i==0);
        i = 0;
        do {
            System.out.println("Digite F para sexo feminino e M para masculino");
            String sexo = scan.next();
            if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
                i = 1;
            }
            else {
                System.out.println("Voce precisa digitar a letra F ou M");
                
            }           
        }
            while(i==0);
        i = 0;
        do {
            System.out.println("Digite S para solteiro, C para casado, V para viuvo"
                    + " e D para divorciado");
            String civil = scan.next();
            if(civil.equalsIgnoreCase("S") || civil.equalsIgnoreCase("C") ||
                    civil.equalsIgnoreCase("V") || civil.equalsIgnoreCase("D")){
                i = 1;
            }
            else {
                System.out.println("Voce precisa digitar S,C,V ou D");
                
            }           
        }
            while(i==0);
        
        
        
        
    }
}
