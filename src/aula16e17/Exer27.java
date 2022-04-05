package aula16e17;
import java.util.Scanner;

public class Exer27 {
    public static void main(String[]args){
        int qtdTemperaturas; double temp, media=0;
        double menor = Double.MAX_VALUE; //menor inicia com maior valor
        double maior = Double.MIN_VALUE;  //maior inicia com menor valor

        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de temperaturas");
        qtdTemperaturas = scan.nextInt();
        
        for(int i=1; i < qtdTemperaturas; i++){
        System.out.println("Entre com a temperatura");
        temp = scan.nextDouble();
        media +=temp;
        if(temp > maior){ 
            maior = temp;
        }
        if(temp < menor){
            menor=temp;
        }
        
        }
        System.out.println(" A media de temperatura e " + (media/qtdTemperaturas));
        System.out.println(" A maior de temperatura e " + maior);
        System.out.println(" A menor de temperatura e " + menor);
    }
}
