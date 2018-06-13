/**
 * Atividade JoKenPo
 * Trio: Geovani, Sabrina, Victor Leite
 * Data: 06/13/2018
 */
package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		char opcao;
		Scanner teclado = new Scanner(System.in);
		do {
		int jogador, player1 = 0, player2 = 0;
		System.out.println("<><><> JoKenPo <><><>");
		System.out.println(" ");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Terousa");
		System.out.println("--------------------------");
		System.out.print("Digite a opção desejada: ");
		jogador = teclado.nextInt();
		System.out.println("--------------------------");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Opção inválida");
			break;	
		}
		Random x = new Random();
		int computador = x.nextInt(2) + 1;
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		}
		
		if (jogador == 1 && computador == 3 || jogador == 2 && computador == 1 || jogador == 3 && computador == 2) {
			System.out.println("--------------------------");
			System.out.println("Jogador Venceu");
			player1++;
			System.out.println("--------------------------");
		} else if (computador == 1 && jogador == 3 || computador == 2 && jogador == 1 || computador == 3 && jogador == 2) {
			System.out.println("--------------------------");
			System.out.println("Computador Venceu");
			player2++;
			System.out.println("--------------------------");
		}else {
			System.out.println("--------------------------");
			System.out.println("Empate");
			System.out.println("--------------------------");
		}
		System.out.println("<><><> Placar <><><>");
		System.out.println(player1 + " X " + player2);
		System.out.print("Deseja jogar novamente (s/n): ");
		opcao = teclado.next().charAt(0);
		}while (opcao == 's');
	}
	static void Pedra() {
	}
	static void Papel() {
	}
	static void Tesoura() {
	}
}
