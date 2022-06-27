package Aula27.Exer3;

public class Aluno {
    String nome, matricula, curso; // declaração de atributos
    String[] nomedasDisciplinas = new String[3]; // cria vetor de strings
    double[][] notaDisciplinas = new double[3][4]; // cria vetor de strings
    Aluno A1[] = new Aluno[10]; // cria vetor de objetos aluno

    public void mostrarInfo() {
        System.out.println("Nome " + nome);
        System.out.println("Matricula " + matricula);
        System.out.println("Nome do curso " + curso);

        for (int i = 0; i < notaDisciplinas.length; i++) {
            System.out.println("Notas da disciplina" + nomedasDisciplinas[i]);
            for (int j = 0; j < nomedasDisciplinas[i].length(); j++) {
                System.out.println("Entre com a nota" + (j + 1));
                System.out.println(notaDisciplinas[i][j] + " ");
            }

            System.out.println();
        }

    }

    double obterMedia(int indice) { // passa o indice da linha
        double soma = 0;
        for (int i = 0; i < notaDisciplinas[indice].length; i++) { //faz a soma das notas
            soma += notaDisciplinas[indice][i];
        }
        double media = soma / 4;
        return media;
    }

}
