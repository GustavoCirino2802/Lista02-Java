public class Exercicio1 {

    public static void executar(){ 

    double[] num = new double[5];
    double media = 0;
    double soma = 0;

    for (int i = 0; i < 5; i++ ){
        num[i] = Prompt.lerDecimal("Digite o" + (i + 1) + "º número: ");
        soma += num[i];
    }

    media = (soma/5);
    Prompt.imprimir("O Valor da média é: " + media);

    for (int i = 0; i < 5; i++ ){
        if (num[i] < media){
            Prompt.imprimir("o " + (i + 1) + "º número é menor que a média!");
            Prompt.separador();
        }
        else if (num[i] > media){
            Prompt.imprimir("o " + (i + 1) + "º número é maior que a média!");
            Prompt.separador();
        }
        else if (num[i] == media){
            Prompt.imprimir("o " + (i + 1) + "º número é igual a média!");
            Prompt.separador();
        }
    }




    
    }
}
