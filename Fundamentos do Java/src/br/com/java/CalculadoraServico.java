package br.com.java;

import java.util.Scanner;

public class CalculadoraServico {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double remuneracao, custo, horas, servico, estimativa, total;
		System.out.println("<><><> Calculadora do Servi�o <><><>");
		System.out.println(" ");
		System.out.print("Remunera��o mensal: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Carga hor�ria mensal de trabalho: ");
		horas = teclado.nextDouble();
		servico = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / horas;
		System.out.println("Valor de hora de servi�o: " + servico);
		System.out.println(" ");
		System.out.print("Estimativa de horas desde servi�o: ");
		estimativa = teclado.nextDouble();
		total = estimativa * servico;
		System.out.println("Valor a ser cobrado desde cliente: " + total);

	}

}
