 package exercicios;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 15;        // Definindo o número de elementos da sequência
        int primeiro = 0, segundo = 1; // Inicializando os dois primeiros números da sequência

        //  quantos números serão gerados
        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
        System.out.print(primeiro + " " + segundo + " ");
     
        
        
        // Loop para gerar e imprimir os próximos números da sequência
        for (int i = 2; i < n; i++) {
            int proximo = primeiro + segundo;// Calculando o próximo número da sequência
           
            
            
            System.out.print(proximo + " ");// Imprimindo o próximo número
            primeiro = segundo;// Atualizando o valor do primeiro número para o segundo
            segundo = proximo;// Atualizando o valor do segundo número para o próximo
        }
    }
}


