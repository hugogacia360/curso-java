package Aula25;

public class App {
    public static void main(String args[]) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.Capacidadecombustivel = 100;
        van.consumo = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia(); //chama o metodo exibir autonomia

    }
}
