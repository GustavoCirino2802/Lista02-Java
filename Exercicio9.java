public class Exercicio9 {

    public static void executar() {

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        int[] vetorC = new int[5 * 2]; 
        
        Prompt.imprimir("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = Prompt.lerInteiro("Elemento " + (i + 1) + ": ");
        }

        Prompt.imprimir("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = Prompt.lerInteiro("Elemento " + (i + 1) + ": ");
        }

        for (int i = 0; i < 5; i++) {
            vetorC[i * 2] = vetorA[i];
            vetorC[i * 2 + 1] = vetorB[i];
        }

        Prompt.separador();
        Prompt.imprimir("Vetor C (elementos das posições pares de A e ímpares de B):");
        for (int i = 0; i < vetorC.length; i++) {
            Prompt.imprimir("Elemento " + (i + 1) + ": " + vetorC[i]);
        }
        Prompt.separador();
    }
}
