package aula19;
import java.util.Random;

//vetorA[i] = (int)Math.round(Math.random() *1);
public class Exer22 {
    public static void main(String[]args){
        int vetorA[] = new int [10];
        double num0=0, num1=0;
        Random aleatorio = new Random();
        
        for(int i=0; i < vetorA.length; i++){
            vetorA[i] = aleatorio.nextInt(2);
            if(vetorA[i] == 0 ){
                num0++;
            }else num1++;
            
            System.out.println(vetorA[i]); 
        }
        num0 = (num0*100)/10;
        num1 = (num1*100)/10;
        System.out.println("A porcentagem de numero 0 e " +num0);
         System.out.println("A porcentagem de numero 1 e " +num1);
    }
}
