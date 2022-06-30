package Aula33.Exer1;

public class Lampada {
    private String modelo;
    private String tensao;
    private String cor;
    private String tipoLuz;
    private String[] tipo = new String[3];
    int potencia;
    boolean tipoAbajur;
    boolean ligada;

    public Lampada(String modelo, String tensao, String cor, String tipoLuz, String[] tipo, int potencia, boolean tipoAbajur, boolean ligada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.tipo = tipo;
        this.potencia = potencia;
        this.tipoAbajur = tipoAbajur;
        this.ligada = ligada;
    }

    public Lampada() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public void ligar (){
        setLigada(true);
    }
    public void desligar(){
        setLigada(false);
    }
    public void mostrarEstado(){
        if(this.ligada){
            System.out.println("Lampada esta ligada");
        }
        else System.out.println("Lampada esta desligada");
    }

}
