package aula20;
import java.util.Random;

public class Exer1 {
    static public void main(String[]args){
        int numAleatorio [] [] = new int [4][4];
        int maior=0, linha=0, coluna=0;
        Random numero = new Random(); //classe que gera numeros aleatorio
        
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
            numAleatorio[i][j] = numero.nextInt(9);
            if(numAleatorio[i][j] > maior){
                maior = numAleatorio[i][j];
                linha = i;
                coluna = j;
            }
        }
        }
        System.out.println("O maior valor e " +maior);
        System.out.println("Linha = " +linha);
        System.out.println("coluna = " +coluna);
    }
}
