package Aula25;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double Capacidadecombustivel;
    double consumo;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro e " + Capacidadecombustivel * consumo + "Km");
    }
}
