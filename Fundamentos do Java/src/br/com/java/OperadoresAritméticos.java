package br.com.java;

import java.util.Scanner;

public class OperadoresAritm�ticos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Linha abaixo cria vari�veis
		float x, y;
		// Linhas abaixo cria cabe�alho
		System.out.println("<><><> Operadores Aritm�ticos <><><>");
		System.out.println(" ");
		// Entrada
		System.out.print("Digite o valor de x: ");
		// A linha abaixo usa o objeto teclado para a vari�vel x
		x = teclado.nextFloat();
		System.out.print("Digite o valor de y: ");
		// A linha abaixo usa o objeto teclado para a vari�vel y
		y = teclado.nextFloat();
		// Soma
		System.out.println("x + y = " + (x + y));
		// Subtra��o
		System.out.println("x - y = " + (x - y));
		// Divis�o
		System.out.println("x / y = " + (x / y));
		// Multiplica��o
		System.out.println("x * y = " + (x * y));
		// M�dulo (usado para obter o resto da divis�o)
		System.out.println("x % y = " + (x % y));
		// Incremento x++ (equivale a x = x + 1)
		x++;
		System.out.println("x++ " + x);
		// Decremento y-- (equivale a y = y - 1)
		y--;
		System.out.println("y-- " + y);

	}

}
