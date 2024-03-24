public class Exercicio6 {

    public static void executar() {
        
        double[] notas = new double[5];
        int[] pesos = new int[5];

        for (int i = 0; i < 5; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + ": ");
        }

        for (int i = 0; i < 5; i++) {
            pesos[i] = Prompt.lerInteiro("Digite o peso da nota " + (i + 1) + ": ");
        }

        double somaNotas = 0;
        int somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double media = somaNotas / somaPesos;

        Prompt.separador();
        Prompt.imprimir("Média ponderada: " + media);
        Prompt.separador();
    }

    }

