package br.com.java;

import java.util.Scanner;

public class OperadoresAritméticos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria variáveis
		float x, y;
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Operadores Aritméticos <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Digite o valor de x: ");
		// A linha abaixo usa o objeto teclado para a variável x
		x = teclado.nextFloat();
		System.out.print("Digite o valor de y: ");
		// A linha abaixo usa o objeto teclado para a variável y
		y = teclado.nextFloat();
		// Soma
		System.out.println("x + y = " + (x + y));
		// Subtração
		System.out.println("x - y = " + (x - y));
		// Divisão
		System.out.println("x / y = " + (x / y));
		// Multiplicação
		System.out.println("x * y = " + (x * y));
		// Módulo (usado para obter o resto da divisão)
		System.out.println("x % y = " + (x % y));
		// Incremento x++ (equivale a x = x + 1)
		x++;
		System.out.println("x++ " + x);
		// Decremento y-- (equivale a y = y - 1)
		y--;
		System.out.println("y-- " + y);

	}

}
