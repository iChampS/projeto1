package br.com.java;

import java.util.Scanner;

public class �reaDoC�rculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria vari�veis
		double pi, raio;
		// Linhas abaixo cria cabe�alho
		System.out.println("<><><> �rea Do C�rculo <><><>");
		System.out.println(" ");
		// Valor da vari�vel pi
		pi = 3.14;
		// Entrada
		System.out.print("Digite o Valor de Raio: ");
		// A linha abaixo usa o objeto teclado para a vari�vel raio
		raio = teclado.nextDouble();
		// Processamento
		raio = raio * raio;
		// + Concatena(junta) um texto com o conte�do da vari�vel raio
		System.out.println("Valor de Raio�: " + raio);
		// Sa�da
		// + Concatena(junta) um texto e multiplica��o com o conte�do da vari�vel raio x pi
		System.out.println("�rea do C�rculo = Raio� x Pi: " + raio * pi);
		
	}

}
