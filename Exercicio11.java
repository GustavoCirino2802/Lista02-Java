public class Exercicio11 {

    public static void executar() {
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        Prompt.imprimir("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = Prompt.lerInteiro("Elemento " + (i + 1) + ": ");
        }

        Prompt.imprimir("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = Prompt.lerInteiro("Elemento " + (i + 1) + ": ");
        }

        int escalar = calcEscalar(vetor1, vetor2);

        Prompt.separador();
        Prompt.imprimir("Produto escalar: " + escalar);
        Prompt.separador();
    }

    public static int calcEscalar(int[] vetor1, int[] vetor2) {
        
        if (vetor1.length != vetor2.length) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho.");
        }

        int escalar = 0;

        for (int i = 0; i < vetor1.length; i++) {
            escalar += vetor1[i] * vetor2[i];
        }

        return escalar;
    }
}
