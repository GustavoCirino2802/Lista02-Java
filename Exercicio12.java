public class Exercicio12 {

    public static void executar() {
        int[] vetor = new int[12];

        Prompt.imprimir("Digite os 12 elementos do vetor:");
        for (int i = 0; i < 12; i++) {
            vetor[i] = Prompt.lerInteiro("Elemento " + (i + 1) + ": ");
        }

        int produto = calcular(vetor);

        Prompt.separador();
        Prompt.imprimir("O produto dos elementos pares positivos é: " + produto);
        Prompt.separador();
    }

    public static int calcular(int[] vetor) {
        int produto = 1;

        for (int i = 0; i < vetor.length; i++) {
            
            if (vetor[i] % 2 == 0 && vetor[i] > 0) {
                produto *= vetor[i];
            }
        }

        return produto;
    }
}
