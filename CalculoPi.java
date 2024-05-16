package exercicios;

public class CalculoPi {
	
	    public static void main(String[] args) {
	        // Define o número de termos na série de Leibniz
	        int numTermos = 1000000;
	        
	        // Inicializa o valor de PI
	        double pi = calcularPi(numTermos);
	        
	        // Imprime o resultado
	        System.out.println("Valor aproximado de PI: " + pi);
	    }

	    // Função para calcular uma aproximação de PI usando a série de Leibniz
	    public static double calcularPi(int numTermos) {
	        double pi = 0;

	        // Calcula a série de Leibniz
	        for (int i = 0; i < numTermos; i++) {
	            double termo = 1.0 / (2 * i + 1);
	            
	            // Alterna a soma e subtração de termos
	            if (i % 2 == 0) {
	                pi += termo;
	            } else {
	                pi -= termo;
	            }
	        }
	        
	        // Multiplica por 4 para obter o valor de PI
	        pi *= 4;
	        
	        return pi;
	    }
	}
