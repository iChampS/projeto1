package br.com.java;

import java.util.Scanner;

public class TemaLivreGBMB {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria vari�veis
		double GB, MB, valor;
		// Linhas abaixo cria cabe�alho
		System.out.println("<><><> Convers�o de Gigabyte para Megabyte <><><>");
		System.out.println(" ");
		// Valor da vari�vel MB (Megabyte)
		MB = 1024;
		// Entrada
		System.out.print("Digite o Valor de Gigabyte (GB): ");
		// A linha abaixo usa o objeto teclado para a vari�vel GB (Gigabyte)
		GB = teclado.nextDouble();
		// Processamento
		valor = (GB * MB);
		// Sa�da
		// + Concatena(junta) um texto e c�digo de numera��o
		System.out.printf("Valor de Gigabyte (GB) Megabyte (MB) " + valor);

	}

}
