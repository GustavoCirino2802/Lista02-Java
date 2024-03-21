public class Exercicio4 {

    public static void executar() {
    
        int[] vetor = new int[5];
        

        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número: ");
        }
        
        int n = Prompt.lerInteiro("Digite um número qualquer (n): ");
        
        Prompt.imprimir("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < n) {
                Prompt.imprimir("Índice " + i + ": " + vetor[i]);
            }
        }
    }
}
