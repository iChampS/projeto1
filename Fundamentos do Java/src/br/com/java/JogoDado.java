package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		char opcao;
		Scanner teclado = new Scanner(System.in);		
		do {	
		// A linha abaixo usa a classe Random para criar um objeto que sera usado para gerar números aleatórios
			Random dado = new Random();
			int face = dado.nextInt(6) + 1; //gerar números aleatórios (0 a 5)
			//5 somamos 1 ao resultado pois não existe a face 0 n dado
			System.out.println("Face do dado: " + face);
			System.out.print("Deseja jogar novamente(s/n)? ");
			//charAt(0) captura apenas a 1ª letra do que foi digitado
			opcao = teclado.next().charAt(0);
		}while(opcao == 's');
	}

}
