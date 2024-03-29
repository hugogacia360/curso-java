package aula20;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][][] compromissos = new String[12][31][8]; // [mes] [dia] [hora]
        boolean sair = false;
        int opcao, dia = 0, hora = 0, mes = 0;

        while (sair != true) {

            System.out.println("Digite 1 para adiciona compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            opcao = scan.nextInt();

            if (opcao == 1) {

                boolean mesValido = false;
                while (!mesValido) {

                    System.out.println("Entre com o mês");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;

                    } else {
                        System.out.println("Invalido");
                    }

                }

                boolean diaValido = false;
                while (!diaValido) {

                    System.out.println("Entre com o dia ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;

                    } else {
                        System.out.println("Invalido");
                    }

                }

                boolean horaValida = false;
                while (!horaValida) {

                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 8) {
                        horaValida = true;

                    } else {
                        System.out.println("Invalido");
                    }

                }

                mes--;
                dia--;
                System.out.println("Entre com o compromisso");
                compromissos[mes][dia][hora] = scan.next();

            } else if (opcao == 2) {

                boolean mesValido = false;
                while (!mesValido) {

                    System.out.println("Entre com o mês");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;

                    } else {
                        System.out.println("Invalido");
                    }

                }

                boolean diaValido = false;
                while (!diaValido) {

                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;

                    } else {
                        System.out.println("Invalido");
                    }

                }

                boolean horaValida = false;
                while (!horaValida) {

                    System.out.println("Entre com a hora do compromisso");
                    hora = scan.nextInt();
                    if (hora > 0 && hora <= 24) {
                        horaValida = true;

                    } else {
                        System.out.println("Invalido");
                    }

                }
                mes--;
                dia--;
                System.out.println("O compromisso agendado e ");
                System.out.println(compromissos[mes][dia][hora]);

            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Invalido");
            }

        }
        scan.close();

    }
}
