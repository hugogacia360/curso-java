package Exer35.Exer0;

public class Calculadora {

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
    public static int fatorial(int num){
        if ( num == 0) {
            return 1;
        }
        return num * fatorial(num -1);
    }


}
