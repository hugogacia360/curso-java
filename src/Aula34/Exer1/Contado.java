package Aula34.Exer1;

public class Contado {
    private static int cont;

    public static void incrementar(){
        cont++;
    }
    public static void zerar(){
        cont = 0;
    }
    public static int getCont(){
        return cont;
    }
}
