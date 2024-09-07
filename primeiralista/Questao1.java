package primeiralista;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano que você nasceu AAAA");
		int anoNasc = sc.nextInt();
		System.out.println("Digite o ano atual AAAA");
		int anoAtual = sc.nextInt();
		int idade = anoAtual - anoNasc;
		
		System.out.printf("Você tem %d anos ", idade);

		sc.close();
	}

}
