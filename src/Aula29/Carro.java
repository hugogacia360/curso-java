package Aula29;

public class Carro {
    String marca, modelo;
    double capCombustivel, consumoCombustivel;
    int numPassageiros;

    public Carro(String marca, String modelo, double capCombustivel, double consumoCombustivel, int numPassageiros) { //metodo construtor da classe carro inicializa os valores dos atributos 
        this.marca = marca;
        this.modelo = modelo;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
        this.numPassageiros = numPassageiros;
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro e " + capCombustivel * consumoCombustivel);
    }

    double obterAutonomia() {
        System.out.println("Metodo obterAutonomia foi chamado ");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}
