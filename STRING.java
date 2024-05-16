package exercicios;

public class STRING {
	
	    public static void main(String[] args) {
	        // Definindo a string original
	        String originalString = "Exemplo de uso de métodos para Strings";
	        
	        // Chamando o método alternarCase() para obter a nova string
	        String novaString = alternarCase(originalString);
	        
	        // Imprimindo a nova string
	        System.out.println(novaString);
	    }

	    // Método para alternar o caso dos caracteres na string
	    public static String alternarCase(String str) {
	        // Inicializando um StringBuilder para armazenar a nova string
	        StringBuilder resultado = new StringBuilder();

	        // Iterando sobre cada caractere na string original
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            
	            // Verificando se o índice do caractere é par ou ímpar
	            if (i % 2 == 0) {
	                // Se for par, converte o caractere para maiúsculo e o adiciona ao resultado
	                resultado.append(Character.toUpperCase(c));
	            } else {
	                // Se for ímpar, converte o caractere para minúsculo e o adiciona ao resultado
	                resultado.append(Character.toLowerCase(c));
	            }
	        }

	        // Retornando a nova string
	        return resultado.toString();
	    }
	}


