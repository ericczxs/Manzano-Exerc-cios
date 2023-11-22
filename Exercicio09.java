package exerciciosManzano;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int quantidadeValores = 10;
        int somatorio = 0;

        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Digite o valor #" + i + ": ");
            int valor = scanner.nextInt();
            somatorio += valor;
        }

        double media = (double) somatorio / quantidadeValores;

        System.out.println("Total do somatório: " + somatorio);
        System.out.println("Média aritmética: " + media);

        scanner.close();

	}

}
