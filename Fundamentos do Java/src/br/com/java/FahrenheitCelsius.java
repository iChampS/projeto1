package br.com.java;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria variáveis
		double F, C;
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Conversão de Fahrenheit em Celsius <><><>");
		System.out.println(" ");
		// Valor da variável F (Fahrenheit)
		F = 32;
		// Entrada
		System.out.print("Digite o valor de Fahrenheit (F): ");
		// A linha abaixo usa o objeto teclado para a variável C (Celsius)
		C = teclado.nextDouble();
		// Processamento
		C = ((C - F) / 1.8);
		// Saída
		// + Concatena(junta) um texto e código de numeração para 
		// ficar apenas 1 número depois da vírgula o conteúdo da variável C (Celsius)
		System.out.printf("Valor de Fahrenheit (F) Celcius (°C) " + "%.1f", C);
				
	}

}
