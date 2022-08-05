package listaEncadeada;

public class No {
    private String conteudo;
    private No proximo;

    public No(String conteudo) { // construtor do nó
        this.conteudo = conteudo;
        this.proximo = null; // referencia inicia nula
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + ", proximo=" + proximo + "]";
    }

}