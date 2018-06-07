package br.com.java;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria vari�veis
		double F, C;
		// Linhas abaixo cria cabe�alho
		System.out.println("<><><> Convers�o de Fahrenheit em Celsius <><><>");
		System.out.println(" ");
		// Valor da vari�vel F (Fahrenheit)
		F = 32;
		// Entrada
		System.out.print("Digite o valor de Fahrenheit (F): ");
		// A linha abaixo usa o objeto teclado para a vari�vel C (Celsius)
		C = teclado.nextDouble();
		// Processamento
		C = ((C - F) / 1.8);
		// Sa�da
		// + Concatena(junta) um texto e c�digo de numera��o para 
		// ficar apenas 1 n�mero depois da v�rgula o conte�do da vari�vel C (Celsius)
		System.out.printf("Valor de Fahrenheit (F) Celcius (�C) " + "%.1f", C);
				
	}

}
