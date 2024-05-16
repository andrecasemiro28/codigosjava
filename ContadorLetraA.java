package exercicios;

public class ContadorLetraA {
	
	    public static void main(String[] args) {
	       
	    	String frase = "Os nomes das classes Java precisam começar com uma letra e depois destas quaisquer combinaçoes de letras e digitos. como padrao , os nomes sao substantivos que iniciam com a letra maiuscula .para as constantes é costuma utilizar sempre letra maiusculas nos nomes.";
	        int contadorA = contarLetraA(frase);
	        System.out.println("Ocorrências da letra 'a': " + contadorA);
	    }
	    
	    
	    public static int contarLetraA(String frase) {
	  
	    	
	    	int contador = 0;
	        for (int i = 0; i < frase.length(); i++) {
	            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
	                contador++;
	          
	            }
	        }
	        return contador;
	    }
	}


