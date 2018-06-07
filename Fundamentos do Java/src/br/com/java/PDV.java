package br.com.java;

import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria vari�veis
		double custo, desconto, recebido, total, troco;
		// Linhas abaixo cria cabe�alho
		System.out.println("<><><> Calculadora de Desconto <><><>");
		System.out.println(" ");;
		// Entrada
		// A linha abaixo indica o valor do produto para o usu�rio
		System.out.print("Pre�o de custo: ");
		// A linha abaixo usa o objeto teclado para a vari�vel custo
		custo = teclado.nextDouble();
		// A linha abaixo indica a porcentagem de lucro para o usu�rio
		System.out.print("% de desconto: ");
		// A linha abaixo usa o objeto teclado para a vari�vel desconto
		desconto = teclado.nextDouble();
		// Processamento
		troco = ((custo * desconto) / 100);
		total = (custo - troco);
		// + Concatena(junta) um texto com o conte�do da vari�vel total
		System.out.println("Pre�o Total: " + total);
		// A linha abaixo indica o valor recebido do cliente para o usu�rio
		System.out.print("Valor Recebido: ");
		// A linha abaixo usa o objeto teclado para a vari�vel recebido
		recebido = teclado.nextDouble();
		// Processamento
		recebido = (recebido - total);
		// Sa�da
		// + Concatena(junta) um texto com o conte�do da vari�vel recebido
		System.out.println("Troco: " + recebido);
	}

}
