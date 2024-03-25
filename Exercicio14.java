public class Exercicio14 {

    public static void executar() {
        int[] vetor = new int[5];

        Prompt.imprimir("Digite os 5 elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = lerInteiro("Elemento " + (i + 1) + ": ");
        }

        int indiceMaior = encontrar(vetor);
        mover(vetor, indiceMaior);

        Prompt.imprimir("Vetor atualizado:");
        imprimirVetor(vetor);
    }

    public static int lerInteiro(String mensagem) {
        Prompt.imprimir(mensagem);
        return Integer.parseInt(Prompt.lerLinha());
    }

    public static int encontrar(int[] vetor) {
        int indiceMaior = 0, maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }
        }
        return indiceMaior;
    }

    public static void mover(int[] vetor, int indiceMaior) {
        int maior = vetor[indiceMaior];
        for (int i = indiceMaior; i < vetor.length - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        vetor[vetor.length - 1] = maior;
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            Prompt.imprimir(vetor[i]);
            if (i < vetor.length - 1) {
                Prompt.imprimir(", ");
            }
        }
        Prompt.imprimir(""); 
    }
}
