package br.com.java;

import java.util.Scanner;

public class ConversãoDólarReal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria variáveis
		double dolar, real;
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Conversão do Dólar para Real <><><>");
		System.out.println(" ");
		// Valor da variável dolar
		dolar = 3.73;
		// Entrada
		System.out.print("Digite o valor em dólar: ");
		// A linha abaixo usa o objeto teclado para a variável real
		real = teclado.nextDouble();
		// Processamento
		real = real * dolar;
		// A linha abaixo indica o preço do dólar para o usuário
		System.out.println("Valor do dólar: 3.73");
		// Sair
		// + Concatena(junta) um texto com o conteúdo da variável real
		System.out.println("Valor do dólar em real: " + real);
		
	}

}
