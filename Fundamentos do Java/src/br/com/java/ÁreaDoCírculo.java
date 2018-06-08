package br.com.java;

import java.util.Scanner;

public class ÁreaDoCírculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria variáveis
		double pi, raio;
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Área Do Círculo <><><>");
		System.out.println(" ");
		// Valor da variável pi
		pi = 3.14;
		// Entrada
		System.out.print("Digite o Valor de Raio: ");
		// A linha abaixo usa o objeto teclado para a variável raio
		raio = teclado.nextDouble();
		// Processamento
		raio = raio * raio;
		// + Concatena(junta) um texto com o conteúdo da variável raio
		System.out.println("Valor de Raio²: " + raio);
		// Saída
		// + Concatena(junta) um texto e multiplicação com o conteúdo da variável raio x pi
		System.out.println("Área do Círculo = Raio² x Pi: " + raio * pi);
		
	}

}
