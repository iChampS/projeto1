package br.com.java;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x = 1; //variável de apoio ao laço while
		int y;
		System.out.print("Digite o valor da tabuada: ");
		y = teclado.nextInt();
		System.out.println(" ");
		while (x < 11) {
			System.out.println(y + " x " + x + " = " + (y * x));
			x++;			
		}
	}

}
