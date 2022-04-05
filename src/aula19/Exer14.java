package aula19;
import java.util.Scanner;

public class Exer14 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);
        int vetorA[] = new int[10], soma=0, count=0;
        double media=0;
        
        for(int i = 0; i < vetorA.length; i ++){
            System.out.println("Digite um valor do vetor na posição " +i);
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 == 1 ) {
                count++;
                soma += vetorA[i];
                media = soma / count;
            }
 
        }
                   System.out.println("A soma dos numeros impares e " + soma);
                   System.out.println("O numero de impares e " + count);
                   System.out.println("A media dos elementos impares e " + media);
        
        
        
        
        
        
        
        
        
        
    }
}
