package exerciciosManzano;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaTotal = 0;
        String resposta;

        do {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = scanner.next();

            System.out.print("Digite a largura do cômodo: ");
            double largura = scanner.nextDouble();

            System.out.print("Digite o comprimento do cômodo: ");
            double comprimento = scanner.nextDouble();

            
            double areaComodo = largura * comprimento;
            System.out.println("Área do " + nomeComodo + ": " + areaComodo + " metros quadrados");

           
            areaTotal += areaComodo;

            
            System.out.print("Deseja calcular outro cômodo?: ");
            resposta = scanner.next().toUpperCase();

        } while (!resposta.equals("NAO"));

        
        System.out.println("Área total da residência: " + areaTotal + " metros quadrados");

        scanner.close();

}
}

