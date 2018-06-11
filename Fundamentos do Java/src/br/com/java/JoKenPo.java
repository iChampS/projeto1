package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int jogador;
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
		} else if (computador == 1 && jogador == 3 || computador == 2 && jogador == 1 || computador == 3 && jogador == 2) {
			System.out.println("--------------------------");
			System.out.println("Computador Venceu");
		}else {
			System.out.println("--------------------------");
			System.out.println("Empate");
		}}
	static void Pedra() {
	}
	static void Papel() {
	}
	static void Tesoura() {
	}
}
