package Exercicio1;

public class Azul {
    private int tonalidade;
    public static String NOME = "Azul";

    public Azul(int tonalidade) {
        this.tonalidade = tonalidade;
    }

    public int getTonalidade() {
        return tonalidade;
    }

    public void setTonalidade(int tonalidade) {
        this.tonalidade = tonalidade;
    }

    public void tornarMaisEscuro() {
        tonalidade -= 10;
    }

    public void tornarTonalidadeMaisEscura(int valor) {
        tonalidade -= valor;
    }

    void calcularTonalidade() {
        int novaValor = tonalidade * 2;
        tonalidade = novaValor;
    }
}
