package aula20;
import java.util.Scanner;

public class Exer3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int MatrizM[][] = new int [3][3];
        int pares=0, impares=0;
        
        for(int i =0; i < MatrizM.length; i++){
            for (int j = 0; j < MatrizM[i].length; j++){
                System.out.println("Digite um numero inteiro");
                MatrizM[i][j] = scan.nextInt();
                if (MatrizM[i][j] % 2 == 0){
                    pares++;
                }else impares++;
            }
        }
        
                System.out.print("A qualtidade de numero pares e " +pares+" \n");
                System.out.print("A quantidade de numeros impares e " +impares+ "\n");
    
        }
        
    }
        

