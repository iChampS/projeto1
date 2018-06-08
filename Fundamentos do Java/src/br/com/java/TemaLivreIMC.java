package br.com.java;

import java.util.Scanner;

public class TemaLivreIMC {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria variáveis
		double peso, altura, imc;
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Índice de Massa Corporal <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Digite seu peso: ");
		// A linha abaixo usa o objeto teclado para a variável peso
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = teclado.nextDouble();
		// Processamento
		imc = peso / (altura * altura);
		// Saída
		// + Concatena(junta) um texto e código de numeração para 
		// ficar apenas 1 número depois da vírgula o conteúdo da variável imc
		System.out.printf("Sua Massa Corporal: " + "%.1f", imc);
		System.out.println(" ");
		// Critérios
		// Menor de 17 - Muito abaixo do peso
		// 17, 18,4 - Abaixo do peso
		// 18,5 e 24,99 - Peso normal
		// 25 e 29,99 - Acima do peso
		// 30 e 34,99 - Obesidade I
		// 35 e 39,99 - Obesidade II (severa)
		// Acima de 40 - Obesidade III (mórbida)
		if (imc < 17) {
			System.out.println("Você está abaixo do peso");
	    } else {
	    if (imc <= 25) {
	    	System.out.println("Você está no peso ideal");
	    } else {
	    	System.out.println("Você está acima do peso");
	    }
	    }
	}

}