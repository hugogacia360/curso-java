package aula19;
import java.util.Scanner;

public class Exer16 {
    public static void main(String[]args){
        int vetorA[] = new int[10];
        int soma=0, count=0, maior15=0, count15=0;
        double media=0;
        Scanner scan = new Scanner(System.in);
        
        for(int i=0; i <vetorA.length; i++){
            System.out.println("Digite um numero inteiro para posição " +i+ " do vetor");
            vetorA[i] = scan.nextInt();
            
        }
        for(int i =0; i <vetorA.length; i++){
        if(vetorA[i] < 15){
                soma += vetorA[i];
            }
            if(vetorA[i] == 15){
                count++;
            }
            if(vetorA[i] > 15){
                maior15 += vetorA[i];
                count15++;
                media = maior15 / count15;
            }
        }
        System.out.println("A soma dos elementos menores que 15 e " +soma);
        System.out.println("A quantidade de elementos iguais a 15 sao  " +count);
        System.out.println("A media dos elementos maiores que 15 sao " +media);
        
    }
}
