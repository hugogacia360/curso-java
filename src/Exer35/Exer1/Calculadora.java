package Exer35.Exer1;

public class Calculadora {
    public static int fibonacci (int num){
        if (num == 0) {
            return 0;
        }
        else if (num == 1) {
            return 1;
        }
        else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
