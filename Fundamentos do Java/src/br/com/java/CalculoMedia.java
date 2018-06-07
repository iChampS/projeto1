package br.com.java;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// a linha abaixo cria variáveis do tipo real
		float nota1, nota2, media;
		// entrada
		System.out.print("Digite a Nota 1: ");
		// a linha abaixo cria um objeto de nome teclado usando Scanner
		Scanner teclado = new Scanner(System.in);
		// a linha abaixo usa o objeto teclado para capturar o que foi
		//digitado no console e armazenar na variável notal1
		nota1 = teclado.nextFloat();
		System.out.print("Digite a Nota 2: ");
		nota2 = teclado.nextFloat();
		// processamento
		media = (nota1+ nota2) /2;
		// saída
		// + concatena(junta) um texto com o conteúdo da variável média
		System.out.println("Média final: " + media);
		
	}

}
