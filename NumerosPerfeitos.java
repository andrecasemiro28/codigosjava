package exercicios;

public class NumerosPerfeitos {

	
	    // Função para verificar se um número é perfeito
	    public static boolean ehNumeroPerfeito(int numero) {
	        int somaDivisores = 0;
	        
	        for (int i = 1; i <= numero / 2; i++) {
	            if (numero % i == 0) {
	                somaDivisores += i;
	            }
	        }
	        
	        return somaDivisores == numero;
	    }

	    public static void main(String[] args) {
	        int contador = 0;
	        int numeroAtual = 1;

	        // Enquanto não encontrarmos os 4 primeiros números perfeitos
	        while (contador < 4) {
	            if (ehNumeroPerfeito(numeroAtual)) {
	                System.out.println(numeroAtual);
	                contador++;
	            }
	            numeroAtual++;
	        }
	    }
	}
