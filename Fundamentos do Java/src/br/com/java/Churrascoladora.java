/**
 * Atividade de avaliação - Churrascoladora
 * @author Geovani Bandeira, Victor Leite
 */

package br.com.java;

import java.util.Scanner;

public class Churrascoladora {

	public static void main(String[] args) {
		// Linha abaixo cria variáveis
		double homem, mulher, crianca, carne0, carne1, carne2, carne3, carne4, cerveja0, cerveja1, cerveja2, cerveja3,
				cerveja4, refri0, refri1, refri2, total, pessoa;
		Scanner teclado = new Scanner(System.in);
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> CHURRASCOLADORA <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Quantidade de homens: ");
		homem = teclado.nextDouble();
		System.out.print("Quantidade de mulheres: ");
		mulher = teclado.nextDouble();
		System.out.print("Quantidade de crianças: ");
		crianca = teclado.nextDouble();
		System.out.print("Preço médio do KG da carne: ");
		carne0 = teclado.nextDouble();
		System.out.print("Preço médio da lata de cerveja: ");
		cerveja0 = teclado.nextDouble();
		System.out.print("Preço médio da lata de refrigerante: ");
		refri0 = teclado.nextDouble();
		// Processamento de Carne
		carne1 = 0.3 * (homem + mulher);
		carne2 = 0.1 * crianca;
		carne3 = carne1 + carne2;
		carne4 = carne3 * carne0;
		// Processamento de Cerveja
		cerveja1 = 12 * homem;
		cerveja2 = 4 * mulher;
		cerveja3 = cerveja1 + cerveja2;
		cerveja4 = cerveja3 * cerveja0;
		// Processamento do Refrigerante
		refri1 = 2 * (crianca + mulher);
		refri2 = refri1 * refri0;
		// Processo do Total do Churrasco
		total = carne4 + cerveja4 + refri2;
		// Processo de divisão por homem e mulher
		pessoa = total / (homem + mulher);
		// Saída
		System.out.println("------------------------------------------------------------");
		System.out.println("<><><> LISTA DE COMPRAS <><><>");
		// Exibir quantidade e preço
		System.out.println("Quantidade total de carne: " + carne3 + " " + "Preço Total: R$ " + carne4);
		System.out.println(" ");
		System.out.println("Quantidade total de cerveja: " + cerveja3 + " " + "Preço Total: R$ " + cerveja4);
		System.out.println(" ");
		System.out.println("Quantidade total de refrigerante: " + refri1 + " " + "Preço Total: R$ " + refri2);
		System.out.println("------------------------------------------------------------");
		System.out.printf("Valor total do churrasco: R$ " + "%.1f", total);
		System.out.println(" ");
		System.out.printf("Valor por pessoa: R$ " + "%.1f", pessoa);

	}

}
