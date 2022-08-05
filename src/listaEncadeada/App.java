package listaEncadeada;

public class App {
    public static void main(String args[]){
        No no1 = new No("Conteudo no1");
        No no2 = new No("Conteudo no2");
        No no3 = new No("Conteudo no3");
        No no4 = new No("Conteudo no4");

        no1.setProximo(no2); //nó 1 aponta para nó2
        no2.setProximo(no3); //nó 2 aponta para nó3
        no3.setProximo(no4); //nó 3 aponta para nó4

        System.out.println(no1);
        System.out.println(no1.getProximo().getProximo().getProximo().getProximo());

    }
}
