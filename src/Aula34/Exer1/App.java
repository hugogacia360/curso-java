package Aula34.Exer1;

public class App {

    static void imprimirValor() {
        System.out.println(Contado.getCont());
    }
    
    public static void main (String args[]){

        imprimirValor();
        Contado.incrementar();
        imprimirValor();
        Contado.zerar();
        imprimirValor();
    }
}
