package primeiralista;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia dois números e a operação aritmética desejada.
		 * Se o usuário digita ‘+’, retorne o resultado da soma entre os números; Se o
		 * usuário digita ‘-’, retorne o resultado da subtração entre os números; Se o
		 * usuário digita ‘*’, retorne o resultado da multiplicação entre os números; Se
		 * o usuário digita ‘/’, retorne o resultado da divisão entre os números;
		 */

		Scanner sc = new Scanner(System.in);
		double n1, n2;

		System.out.println("Digite um número: ");
		n1 = sc.nextDouble();
		System.out.println("Digite outro número: ");
		n2 = sc.nextDouble();

		System.out.println("Qual operação você deseja realizar? ");
		System.out.println("'+' Adição"
				+ "\n'-' Subtração" 
				+ "\n'*' Multiplicação" 
				+"\n'/' Divisão");
		char opcao = sc.next().charAt(0);

		switch (opcao) {
		case '+':
			double soma = n1 + n2;
			System.out.printf("%.2f + %.2f = %.1f", n1, n2, soma);
			break;

		case '-':
			double sub = n1 - n2;
			System.out.printf("%.2f - %.2f = %.1f", n1, n2, sub);
			break;
		case '*':
			double mult = n1 * n2;
			System.out.printf("%.2f * %.2f = %.1f", n1, n2, mult);
			break;
		case '/':
			double div = n1 / n2;
			System.out.printf("%.2f / %.2f = %.1f", n1, n2, div);
			break;

		}
		sc.close();

	}
}