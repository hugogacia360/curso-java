package Aula27;

public class Carro {
    String marca;
        String modelo;
        int numPassageiros;
        double Capacidadecombustivel;
        double consumo;

        void exibirAutonomia() {
            System.out.println("A autonomia do carro e " + Capacidadecombustivel * consumo + "Km");
        }
        double obterAutonomia(){
            System.out.println("O metodo obterAutonomia foi chamado");
            return Capacidadecombustivel * consumo;
        }
        double calcularCombustivel(double km){
            double qtdCombustivel = km/consumo;
            return qtdCombustivel;
        }
}
