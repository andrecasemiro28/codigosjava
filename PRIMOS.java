package exercicios;

public class PRIMOS {
    public static void main(String[] args) {
       
    	
    	// Percorrendo os números de 2 a 100
       
    	for (int i = 2; i <= 100; i++) {
          
        
        	boolean ehPrimo = true; // Assumindo que o número é primo

         
        	// Verificando se o número é divisível por algum número diferente de 1 e ele mesmo
            for (int j = 2; j < i; j++) {
             
            	if (i % j == 0) { // Se o número for divisível por outro número
                
            		
            		ehPrimo = false; // O número não é primo
                    break; // Sai do loop interno
                }
            }

            // Se o número for primo, imprime
            if (ehPrimo) {
                System.out.print(i + " ");
            }
        }
    }
}
