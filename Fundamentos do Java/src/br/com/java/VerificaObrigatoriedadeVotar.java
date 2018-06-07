package br.com.java;

import java.util.Scanner;

public class VerificaObrigatoriedadeVotar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria variável
		int idade;
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Verificar obrigatoriedade de votar <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Digite a sua idade: ");
		// A linha abaixo usa o objeto teclado para a variável idade
		idade = teclado.nextInt();
		/* Critérios
		 * Menor de 16 anos - Proibido votar
		 * 16, 17 ou acima de 70 - Voto facultativo
		 * Entre 18 e 70 - Obrigatório votar
		 */
		if (idade < 16) {
			System.out.println("Proibido votar");
		} else if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println("Voto facultativo");
		} else {
			System.out.println("Voto obrigatório");
		}
	}

}
