public class Exercicio6 { 
    
    public static void executar() {

        Double nota[] = new Double[5];
        Double peso[] = new Double[5];

        for(int i = 0; i < 5; i++) {
            Double nota[i] = Prompt.lerDecimal("Digite sua" + i + "º nota: ");
            Double peso[i] = Prompt.lerDecimal("Digite o peso da nota" + i + ":");   
            soma += peso[i];  
        }

        for(int i = 0; i < 5; i++) {
            Double media = nota[i] * peso[i]
        }


        

    }
}