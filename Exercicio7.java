public class Exercicio7 {

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

        boolean iguais = true;
        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                iguais = false;
                break;
            }
        }

        Prompt.separador();
        if (iguais) {
            Prompt.imprimir("Os vetores são iguais.");
        } else {
            Prompt.imprimir("Os vetores não são iguais.");
        }
        Prompt.separador();
    }
}
