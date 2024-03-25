import java.util.Arrays;

public class Exercicio13 {

    public static void executar() {
        int n = Prompt.lerInteiro("Digite o valor de n:");

        int[] fibonacci = gerarSequenciaFibonacci(n);

        Prompt.imprimir("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        Prompt.imprimir(Arrays.toString(fibonacci));
    }

    public static int[] gerarSequenciaFibonacci(int n) {
        int[] fibonacci = new int[n];

        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
