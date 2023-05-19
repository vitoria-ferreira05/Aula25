package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Azul azul = new Azul(30);

        int tonalidadeAtual = azul.getTonalidade();
        System.out.println("Tonalidade atual: " + tonalidadeAtual);

        azul.setTonalidade(50);
        System.out.println("Nova tonalidade: " + azul.getTonalidade());

        azul.tornarMaisEscuro();
        System.out.println("Tonalidade mais escura: " + azul.getTonalidade());

        azul.calcularTonalidade();
        System.out.println("Nova tonalidade calculada: " + azul.getTonalidade());
    }
}


