package Aula27.Exer1;

public class Exer1 {
    public static void main(String args[]){
        Lampada L1 = new Lampada();

        L1.ligar();
        System.out.println("A lampada esta " + L1.ligada);
        L1.desligar();
        System.out.println("A lampada esta " + L1.ligada);

    }
}
