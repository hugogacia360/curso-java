package aula19;
import java.util.Scanner;

public class Exer17 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int [10], count=0;
        
        for(int i=0; i <vetorA.length; i++){
            System.out.println("Digite a idade");
            vetorA[i] = scan.nextInt();
            if(vetorA[i] > 35) {
                count++;
                System.out.println(count +" pessoas tem idade maior que 35 anos");
            }
        }
        
    }
}
