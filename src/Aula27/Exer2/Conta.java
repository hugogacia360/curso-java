package Aula27.Exer2;

public class Conta {
    String numero;
    String agencia;
    boolean especial;
    double saldo;
    double limiteEspecial;

    boolean realizarSaque(double saque) {
        if (saldo >= saque) {
            saldo = saldo - saque;
            return saldo;
        }

    }

    void deposito() {

    }

}
