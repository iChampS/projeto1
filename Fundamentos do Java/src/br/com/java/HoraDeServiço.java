package br.com.java;

import java.util.Scanner;

public class HoraDeServi�o {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// A linha abaixo cria vari�veis
		double remuneracao, horaria, custo, total, imposto, investimento;
		// Linhas abaixo cria cabe�alho
		System.out.println("<><><> C�lculo do valor do servi�o <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Digite a remunera��o mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Digite a carga hor�ria mensal de trabalho: ");
		horaria = teclado.nextDouble();
		System.out.print("Digite o custo operacional: ");
		custo = teclado.nextDouble();
		total = (remuneracao * 0.3);
		System.out.println("Imposto de 30%: " + total);		
		investimento = (remuneracao * 0.2);
		System.out.println("Investimento de 20%: " + investimento);
		System.out.println("Total: ");
	}

}
