package primeiralista;

import java.util.Scanner;

/* Escreva um programa que leia a idade de várias pessoas e calcule a média. O
 * programa deve ler as idades até o usuário digitar 0 (zero).*/

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int cont = 0, idade,soma=0; 
		System.out.println("Digite uma idade ");
		idade=sc.nextInt();
		while (idade != 0) {
			System.out.println("Digite outra idade:");
			soma+=idade=sc.nextInt();
			cont+=1;
		}
		System.out.printf("A média das idades digitadas foi "+soma/cont);
	
	sc.close();
	
	}
}
