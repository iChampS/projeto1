package br.com.java;

import java.util.Scanner;

public class TemaLivreGBMB {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria variáveis
		double GB, MB, valor;
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Conversão de Gigabyte para Megabyte <><><>");
		System.out.println(" ");
		// Valor da variável MB (Megabyte)
		MB = 1024;
		// Entrada
		System.out.print("Digite o Valor de Gigabyte (GB): ");
		// A linha abaixo usa o objeto teclado para a variável GB (Gigabyte)
		GB = teclado.nextDouble();
		// Processamento
		valor = (GB * MB);
		// Saída
		// + Concatena(junta) um texto e código de numeração
		System.out.printf("Valor de Gigabyte (GB) Megabyte (MB) " + valor);

	}

}
