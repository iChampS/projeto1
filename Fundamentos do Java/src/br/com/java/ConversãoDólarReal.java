package br.com.java;

import java.util.Scanner;

public class Convers�oD�larReal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria vari�veis
		double dolar, real;
		// Linhas abaixo cria cabe�alho
		System.out.println("<><><> Convers�o do D�lar para Real <><><>");
		System.out.println(" ");
		// Valor da vari�vel dolar
		dolar = 3.73;
		// Entrada
		System.out.print("Digite o Valor em D�lar: ");
		// A linha abaixo usa o objeto teclado para a vari�vel real
		real = teclado.nextDouble();
		// Processamento
		real = real * dolar;
		// A linha abaixo indica o pre�o do d�lar para o usu�rio
		System.out.println("Valor do D�lar: 3.73");
		// Sair
		// + Concatena(junta) um texto com o conte�do da vari�vel real
		System.out.println("Valor do D�lar em Real: " + real);
		
	}

}
