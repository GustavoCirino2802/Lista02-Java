public class Exercicio3 {

    public static void executar(){ 

    int vetor[] = new int [5];
    int dobro[] = new int [5];

    for (int i = 0; i < 5; i++) {

        vetor[i] = Prompt.lerInteiro("Digite 5 números: ");
        dobro[i] = (vetor[i] *2);
    }

    for (int i = 0; i < 5; i++) {

        Prompt.imprimir("O " + (i + 1) + "º" + " número do vetor é = " + dobro[i]);   
        Prompt.separador();
    }
        } 
    }