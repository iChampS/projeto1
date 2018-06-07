package br.com.java;

import java.util.Scanner;

public class TemaLivreIMC {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria variáveis
		double peso, altura, imc;
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Índice de Massa Corporal <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Digite seu peso: ");
		// A linha abaixo usa o objeto teclado para a variável peso
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = teclado.nextDouble();
		// Processamento
		imc = peso / (altura * altura);
		// Saída
		// + Concatena(junta) um texto e código de numeração para 
		// ficar apenas 1 número depois da vírgula o conteúdo da variável imc
		System.out.printf("Sua massa corporal: " + "%.1f", imc);
		
	}

}
