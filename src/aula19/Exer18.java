package aula19;
import java.util.Scanner;

public class Exer18 {
    public static void main(String[]args){
         Scanner scan = new Scanner(System.in);
            int vetorA[] = new int [10], menorIdade=Integer.MAX_VALUE,
            maiorIdade=Integer.MIN_VALUE, elementoMaior=0, elementoMenor=0;
        
        for(int i=0; i <vetorA.length; i++){
            System.out.println("Digite a idade da " +i+ " pessoa");
            vetorA[i] = scan.nextInt();
            if(vetorA[i] > maiorIdade) {
               maiorIdade = vetorA[i];
               elementoMaior = i;
            }
            if(vetorA[i] < menorIdade){
                menorIdade = vetorA[i];
                elementoMenor = i;
            }
        }
        System.out.println("A pessoa com maior idade tem " +maiorIdade+ " anos");
        System.out.println("A posição da maior idade no vetor e " +elementoMaior);
        System.out.println("A pessoa com menor idade tem " +menorIdade+ " anos");
        System.out.println("A posição da menor idade no vetor e " +elementoMenor);
    }
}
