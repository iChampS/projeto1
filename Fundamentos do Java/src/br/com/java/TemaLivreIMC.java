package br.com.java;

import java.util.Scanner;

public class TemaLivreIMC {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria vari�veis
		double peso, altura, imc;
		// Linhas abaixo cria cabe�alho
		System.out.println("<><><> �ndice de Massa Corporal <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Digite seu peso: ");
		// A linha abaixo usa o objeto teclado para a vari�vel peso
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = teclado.nextDouble();
		// Processamento
		imc = peso / (altura * altura);
		// Sa�da
		// + Concatena(junta) um texto e c�digo de numera��o para 
		// ficar apenas 1 n�mero depois da v�rgula o conte�do da vari�vel imc
		System.out.printf("Sua massa corporal: " + "%.1f", imc);
		
	}

}
