package primeiralista;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		/*
		 * Leia o peso e a altura de 05 pessoas e calcule o IMC e armazene em um vetor.
		 * Após o termino do programa, imprima as seguintes informações:  O Número de
		 * pessoas que estão abaixo do peso (IMC < 18,5);  O Número de pessoas que
		 * estão dentro do peso ideal (IMC > 18,5 e IMC < 25);  O Número de pessoas que
		 * estão acima do peso (IMC > = 25)
		 */
		Scanner sc = new Scanner(System.in);
		double[] imcs = new double[5];
		int abaixoPeso = 0, acimaPeso = 0, dentroPeso = 0;
		for (int i = 0; i < 5; i++) {

			System.out.println("Digite a altura: ");
			double altura = sc.nextDouble();
			System.out.println("Digite o peso: ");
			double peso = sc.nextDouble();
			imcs[i] = peso / (altura * altura);// calcular imc e adicionar na i posicao de imcs
			
			if (imcs[i] < 18.5) {
				abaixoPeso += 1;
			} else if (imcs[i] >= 18.5 && imcs[i] < 25) {
				dentroPeso += 1;

			} else {
				acimaPeso += 1;
			}
		}
		System.out.printf(
				"O Número de pessoas que estão abaixo do peso (IMC < 18,5) é: \n%d \r\n"
						+ "\nO Número de pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC < 25) é: \n%d \r\n"
						+ "\nO Número de pessoas que estão acima do peso (IMC > = 25) é: \n%d",
				abaixoPeso, dentroPeso, acimaPeso);
		sc.close();

	}

}
