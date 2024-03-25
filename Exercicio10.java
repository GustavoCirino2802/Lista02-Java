public class Exercicio10 {

    public static void executar() {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < 5; i++) {
            vetorA[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A:");
        }
        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i];
        }

        Prompt.separador();
        
        Prompt.imprimir("Vetor B (elementos de A copiados de forma invertida):");
        for (int i = 0; i < 5; i++) {
            Prompt.imprimir("Elemento " + (i + 1) + ": " + vetorB[i]);
        }
        Prompt.separador();
    }
}
