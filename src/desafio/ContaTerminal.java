package desafio;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, digite o número da Agência");
		int numero = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Por favor, digite o nome da Agência");
		String agencia = teclado.nextLine();
		System.out.println("Por favor, digite o nome dao Cliente");
		String nome = teclado.nextLine();
		System.out.println("Por favor, digite o saldo");
		double saldo = teclado.nextDouble();

		System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta"+ numero+" e seu saldo"+ saldo +" já está disponível para saque");


	}

}
