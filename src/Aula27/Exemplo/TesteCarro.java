package Aula27;

public class TesteCarro {
    public static void main(String args[]) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.Capacidadecombustivel = 100;
        van.consumo = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia(); // chama o metodo exibir autonomia

        // double autonomia = van.obterAutonomia(); //variavel autonomia receber o
        // retorno do metodo obterAutonomia
        System.out.println("A autonomia do carro e " + van.obterAutonomia()); // metodo void sem parametro
        System.out.println("qtdCombustivel " + van.calcularCombustivel(10)); // passa o parametro para o metodo

    }
}
