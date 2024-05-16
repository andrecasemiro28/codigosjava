package exercicios;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo e lendo os valores para o primeiro veículo
        System.out.println("Digite o peso do primeiro veículo em quilos:");
        int pesoVeiculo1 = scanner.nextInt();

        System.out.println("Digite a velocidade máxima do primeiro veículo em km/h:");
        int velocidadeMaximaVeiculo1 = scanner.nextInt();

        System.out.println("Digite o preço do primeiro veículo em R$:");
        float precoVeiculo1 = scanner.nextFloat();

        // Instanciando o primeiro veículo com os valores lidos
        Veiculo veiculo1 = new Veiculo(pesoVeiculo1, velocidadeMaximaVeiculo1, precoVeiculo1);

        // Pedindo e lendo os valores para o segundo veículo
        System.out.println("Digite o peso do segundo veículo em quilos:");
        int pesoVeiculo2 = scanner.nextInt();

        System.out.println("Digite a velocidade máxima do segundo veículo em km/h:");
        int velocidadeMaximaVeiculo2 = scanner.nextInt();

        System.out.println("Digite o preço do segundo veículo em R$:");
        float precoVeiculo2 = scanner.nextFloat();

        // Instanciando o segundo veículo com os valores lidos
        Veiculo veiculo2 = new Veiculo(pesoVeiculo2, velocidadeMaximaVeiculo2, precoVeiculo2);

        // Fechando o Scanner
        scanner.close();

        // Exibindo os dados para cada um dos objetos veículo
        System.out.println("\nVeículo 1:");
        System.out.println(veiculo1);

        System.out.println("\nVeículo 2:");
        System.out.println(veiculo2);
    }
}
