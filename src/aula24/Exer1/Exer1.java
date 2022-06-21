package aula24.Exer1;

public class Exer1 {
    public static void main (String args[]){

        Lampada L1 = new Lampada(); //instancia um objeto da classe lampada
        L1.modelo = "A60";
        L1.potencia = 15;
        L1.cor = "Branca";
        L1.tensao = "127";
        L1.tipoLuz = "LED";
        L1.garatia = 6;
        L1.Abajur = false;

        L1.tipos = new String[5]; //instancia um vetor de objetos do tipo String
        L1.tipos[0] = "Abajur";
        L1.tipos[1] = "lampeao";

    }
}
