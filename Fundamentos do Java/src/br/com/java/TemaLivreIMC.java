package br.com.java;

import java.util.Scanner;

public class TemaLivreIMC {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria vari�veis
		double peso, altura, imc;
		// Linhas abaixo cria cabe�alho
		System.out.println("<><><> �ndice de Massa Corporal <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Digite seu peso: ");
		// A linha abaixo usa o objeto teclado para a vari�vel peso
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = teclado.nextDouble();
		// Processamento
		imc = peso / (altura * altura);
		// Sa�da
		// + Concatena(junta) um texto e c�digo de numera��o para 
		// ficar apenas 1 n�mero depois da v�rgula o conte�do da vari�vel imc
		System.out.printf("Sua Massa Corporal: " + "%.1f", imc);
		System.out.println(" ");
		// Crit�rios
		// Menor de 17 - Muito abaixo do peso
		// 17, 18,4 - Abaixo do peso
		// 18,5 e 24,99 - Peso normal
		// 25 e 29,99 - Acima do peso
		// 30 e 34,99 - Obesidade I
		// 35 e 39,99 - Obesidade II (severa)
		// Acima de 40 - Obesidade III (m�rbida)
		if (imc < 17) {
			System.out.println("Voc� est� abaixo do peso");
	    } else {
	    if (imc <= 25) {
	    	System.out.println("Voc� est� no peso ideal");
	    } else {
	    	System.out.println("Voc� est� acima do peso");
	    }
	    }
	}

}