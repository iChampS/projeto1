package br.com.java;

import java.util.Scanner;

public class CalculadoraLucro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria vari�veis
		double custo, lucro, venda;
		// Linhas abaixo cria o cabe�alho
		System.out.println("<><><> Calculadora de Lucro <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Pre�o de Custo: ");
		// A linha abaixo usa o objeto teclado para a vari�vel custo
		custo = teclado.nextDouble();
		// A linha abaixo indica a porcentagem de lucro para o usu�rio
		System.out.print("% de Lucro: ");
		// A linha abaixo usa o objeto teclado para a vari�vel lucro
		lucro = teclado.nextDouble();
		// Processamento
		venda = custo + ((custo * lucro) / 100);
		// Sa�da
		// + Concatena(junta) um texto com o conte�do da vari�vel venda
		System.out.println("Pre�o de Venda: " + venda);
		
	}

}
