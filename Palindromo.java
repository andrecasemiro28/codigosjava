package exercicios;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string para verificar se é um palíndromo:");
        String input = scanner.nextLine(); // Solicita ao usuário que insira uma string
        
      
        
        // Verifica se a string é um palíndromo e imprime o resultado
        if (ehPalindromo(input)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
        
        scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
    }
    
    
    
    // Método para verificar se uma string é um palíndromo
    public static boolean ehPalindromo(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase(); // Remove espaços em branco e converte para minúsculas
        int length = str.length();
        
      
        
        
        // Percorre a metade da string, comparando caracteres simétricos
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) { // Verifica se os caracteres correspondentes são diferentes
                return false; // Se forem diferentes, a string não é um palíndromo
       
            
            }
        }
        return true; // Se não houver diferenças, a string é um palíndromo
    }
}
