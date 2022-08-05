package listaEncadeada;

public class No<T> {   //adiciona tipo generico T
    private T conteudo;
    private No<T> proximo;

    public No(T conteudo) { // construtor do nó
        this.conteudo = conteudo;
        this.proximo = null; // referencia inicia nula
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximo;
    }

    public void setProximoNo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + ", proximo=" + proximo + "]";
    }

}