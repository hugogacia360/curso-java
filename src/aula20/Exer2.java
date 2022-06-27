package aula20;
import java.util.Random;

public class Exer2 {

    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[10][10];
        int maiorL5=0, menorL5=101, maiorC7=0, menorC7=101;

        Random numeroRandom = new Random();
            for( int i=0; i < numerosAleatorios.length; i++){ //length retorna [i]
                for(int j=0; j <numerosAleatorios[i].length; j++){ //length retorna [j]
                    numerosAleatorios [i][j] = numeroRandom.nextInt(100); //enche matriz de random
                    
                }  
            }
            for( int i=0; i < numerosAleatorios[5].length; i++){ //length retorna [i]
                
                    if(numerosAleatorios[5][i] > maiorL5){
                        maiorL5 = numerosAleatorios[5][i];
                    }
                    if(numerosAleatorios[5][i] < menorL5){
                        menorL5 = numerosAleatorios[5][i];
                    }
            }
            
            
            for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
            }
               
        System.out.println("O maior na linha 5 e " +maiorL5);
        System.out.println("O menor na linha 5 e " +menorL5);
        
        for(int i=0; i < numerosAleatorios.length; i++){
            if( numerosAleatorios[i][7] > maiorC7){
                maiorC7 = numerosAleatorios[i][7];
            }
            if( numerosAleatorios[i][7] < menorC7){
                menorC7 = numerosAleatorios[i][7];
            }
        }
        System.out.println("O maior na coluna 7 e " +maiorC7);
        System.out.println("O menor na coluna 7 e " +menorC7);
        
    }
}    