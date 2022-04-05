package aula19;
import java.util.Scanner;

public class Exer23 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[10];
        
        for(int i = 0; i <vetorA.length; i++){
            System.out.println("Digite o valor da posição " +i+ " do vetor");
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 == 1) {
                System.out.println("O numero e impar encerrando o programa");
                break;
        }
    }
}
}
