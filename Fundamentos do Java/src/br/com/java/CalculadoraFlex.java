package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double gas, alcool, total;
		System.out.println("<><><> Calculadora Flex <><><>");
		System.out.println(" ");
		System.out.print("Digite o valor do álcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da gasolina: ");
		gas = teclado.nextDouble();
		total = alcool / gas;
		System.out.printf("Resultado: " + "%.2f", total);
		System.out.println("");
		if (total < 0.7) {
		System.out.println("Maior vantagem em abastecer com Álcool");
		} else {
        System.out.println("Maior vantagem em abastecer com Gasolina");
		}
		
		

	}

}