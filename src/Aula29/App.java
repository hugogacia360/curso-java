package Aula29;

public class App {
    public static void main (String args[]){

        Carro van = new Carro("Fiat", "Ducato", 100, 10, 23);  // passa os parametros pro metodo construtor

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);
        System.out.println(van.numPassageiros);


    }
}
