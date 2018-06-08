package br.com.java;

import java.util.Scanner;

public class CalculadoraLucro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria variáveis
		double custo, lucro, venda;
		// Linhas abaixo cria o cabeçalho
		System.out.println("<><><> Calculadora de Lucro <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Preço de Custo: ");
		// A linha abaixo usa o objeto teclado para a variável custo
		custo = teclado.nextDouble();
		// A linha abaixo indica a porcentagem de lucro para o usuário
		System.out.print("% de Lucro: ");
		// A linha abaixo usa o objeto teclado para a variável lucro
		lucro = teclado.nextDouble();
		// Processamento
		venda = custo + ((custo * lucro) / 100);
		// Saída
		// + Concatena(junta) um texto com o conteúdo da variável venda
		System.out.println("Preço de Venda: " + venda);
		
	}

}
