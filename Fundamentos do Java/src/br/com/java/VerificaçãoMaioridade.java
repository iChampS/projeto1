package br.com.java;

import java.util.Scanner;

public class VerificaçãoMaioridade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linhas abaixo cria variáveis
		String nome;
		int idade;
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Verificação Maioridade <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Digite o seu nome: ");
		// A linha abaixo usa o objeto teclado para a variável nome
		nome = teclado.nextLine();
		System.out.print("Digite sua idade: ");
		// A linha abaixo usa o objeto teclado para a variável idade
		idade = teclado.nextInt();
		System.out.println("------------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		// Estruta condicional para verificar status:
		// Menor que 18 = Menor de idade
		// Igual ou maior que 18 = Maior de idade
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		
	}

}
