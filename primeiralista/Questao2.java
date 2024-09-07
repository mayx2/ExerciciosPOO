package primeiralista;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Escreva um programa que leia a altura de 05 pessoas e calcule a média.

		double soma = 0;
		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite a  altura da %d° pessoa ", i + 1);
			double altura = sc.nextDouble();
			soma += altura;
		}
		double media = soma / 5;
		System.out.printf("A media das 5 alturas digitadas é igual a %.2f ", media);
		sc.close();

	}

}
