package br.com.java;

import java.util.Scanner;

public class HoraDeServiço {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// A linha abaixo cria variáveis
		double remuneracao, horaria, custo, total, imposto, investimento;
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Cálculo do valor do serviço <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Digite a remuneração mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Digite a carga horária mensal de trabalho: ");
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
