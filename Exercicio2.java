public class Exercicio2 {

    public static void executar(){ 

    int vetor[] = new int [5];

    for (int i = 0; i < 5; i++) {

        vetor[i] = Prompt.lerInteiro("Digite 5 números: ");
    }

    for (int i = 0; i < 5; i++) {
        if (vetor[i] > 0 ){
            Prompt.imprimir("O " + (i + 1) + "º" + " número digitado é positivo!");        
        }

        if (vetor[i] < 0 ){
            Prompt.imprimir("O " + (i + 1) + "º" + " número digitado é negativo!");        
        }

        if (vetor[i] == 0 ){
            Prompt.imprimir("O " + (i + 1) + "º" + " número digitado é igual a zero!");        
        }       
    }
        } 
    }