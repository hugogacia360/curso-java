package Aula27.Exer3;

import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Aluno A1 = new Aluno(); // instancia o objeto aluno

        System.out.println("Entre com nome do aluno");
        A1.nome = scan.nextLine();

        System.out.println("Entre com nome do curso");
        A1.curso = scan.nextLine();

        System.out.println("Entre com nome da matricula");
        A1.matricula = scan.nextLine();

        for (int i = 0; i < A1.nomedasDisciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina");
            A1.nomedasDisciplinas[i] = scan.nextLine();
        }

        for (int i = 0; i < A1.notaDisciplinas.length; i++) {
            System.out.println("Obetendo notas da disciplina" + A1.nomedasDisciplinas);
            for (int j = 0; j < A1.nomedasDisciplinas[i].length(); j++) {
                System.out.println("Entre com a nota" + (j + 1));
                A1.notaDisciplinas[i][j] = scan.nextDouble();
            }
        }

        A1.mostrarInfo();
        scan.close();
    }
    
}
