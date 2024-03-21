public class Exercicio5 {

    public static void executar() {

        int[] vetor = new int[5];
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número: ");
        }

        int num = Prompt.lerInteiro("Digite um número: ");
    
        for (int i = 0; i < 5; i++) {

            if(num == vetor[i]){
                contador++;
            }

        }
        
        Prompt.separador();
        Prompt.imprimir("O número aparece " + contador +  " vezes");
        Prompt.separador();
            



    }
}