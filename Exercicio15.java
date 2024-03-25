public class Exercicio15 {

    public static void executar() {
        int[] vetor = new int[5];

        Prompt.imprimir("Digite 5 números:");

        vetor[0] = lerInteiro("Número 1: ");

        for (int i = 1; i < 5; i++) {
            vetor[i] = lerInteiroMaiorQueAnterior("Número " + (i + 1) + ": ", vetor[i - 1]);
        }

        Prompt.imprimir("Vetor preenchido:");
        imprimirVetor(vetor);
    }

    public static int lerInteiro(String mensagem) {
        return Integer.parseInt(Prompt.lerLinha(mensagem));
    }

    public static int lerInteiroMaiorQueAnterior(String mensagem, int anterior) {
        int numero;
        do {
            numero = lerInteiro(mensagem);
            if (numero <= anterior) {
                Prompt.imprimir("O número deve ser maior que o anterior (" + anterior + "). Tente novamente.");
            }
        } while (numero <= anterior);
        return numero;
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            Prompt.imprimir(vetor[i]);
            if (i < vetor.length - 1) {
                Prompt.imprimir(", ");
            }
        }
    }
}
