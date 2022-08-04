package Aula34.Exer2;

public class App {
    public static void main (String args[]){
        imprimirTela(Calculadora.somar(1, 2));
        imprimirTela(Calculadora.subtrair(2, 1));
        imprimirTela(Calculadora.multiplicar(2, 2));
        imprimirTela(Calculadora.dividir(4, 2));
        imprimirTela(Calculadora.potencia(3, 3));
    }
    public static void imprimirTela(int num){
        System.out.println(num);
    }
}
