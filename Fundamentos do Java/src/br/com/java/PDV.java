package br.com.java;

import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria variáveis
		double custo, desconto, recebido, total, troco;
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Calculadora de Desconto <><><>");
		System.out.println(" ");;
		// Entrada
		// A linha abaixo indica o valor do produto para o usuário
		System.out.print("Preço de custo: ");
		// A linha abaixo usa o objeto teclado para a variável custo
		custo = teclado.nextDouble();
		// A linha abaixo indica a porcentagem de lucro para o usuário
		System.out.print("% de desconto: ");
		// A linha abaixo usa o objeto teclado para a variável desconto
		desconto = teclado.nextDouble();
		// Processamento
		troco = ((custo * desconto) / 100);
		total = (custo - troco);
		// + Concatena(junta) um texto com o conteúdo da variável total
		System.out.println("Preço Total: " + total);
		// A linha abaixo indica o valor recebido do cliente para o usuário
		System.out.print("Valor Recebido: ");
		// A linha abaixo usa o objeto teclado para a variável recebido
		recebido = teclado.nextDouble();
		// Processamento
		recebido = (recebido - total);
		// Saída
		// + Concatena(junta) um texto com o conteúdo da variável recebido
		System.out.println("Troco: " + recebido);
	}

}
