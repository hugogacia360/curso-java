package Aula34.Exer3;

public class Fatorial {

    public static int somar(int num1, int num2){
        return num1 + num2;
    }
    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    public static int dividir(int num1, int num2){
        return num1 / num2;
    }
    public static int potencia(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }
    public static int fatorialDoNumero(int num){
        if ( num == 0 ) {
            return 1;
        }
        else {
        int fatorial = 1;
        for (int i = num; i > 1; i--) {
            fatorial *= i;
        }
        return fatorial;

       }
    }


}
