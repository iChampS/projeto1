package br.com.java;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// A linha abaixo cria vari�veis
		float nota1, nota2, media;
		// Entrada
		// Linhas abaixo cria cabe�alho
		System.out.println("<><><> M�dia do Aluno <><><>");
		System.out.println(" ");
		System.out.print("Digite a Nota 1: ");
		// A linha abaixo cria um objeto de nome teclado usando Scanner
		Scanner teclado = new Scanner(System.in);
		// A linha abaixo usa o objeto teclado para capturar o que foi
		//digitado no console e armazenar na vari�vel notal1
		nota1 = teclado.nextFloat();
		System.out.print("Digite a Nota 2: ");
		nota2 = teclado.nextFloat();
		// Processamento
		media = (nota1+ nota2) /2;
		// Sa�da
		// + Concatena(junta) um texto com o conte�do da vari�vel m�dia
		System.out.println("M�dia Final: " + media);
		// Estruta condicional para verificar status do aluno:
		// Menor ou igual a 2 = reprovado
		// Entre 2 e 5 = recupera��o
		// Maior ou igual a 5 = aprovado
		if (media <= 2) {
			System.out.println("Aluno Reprovado");
		} else if (media > 2 && media <5) {
			System.out.println("Aluno de Recupera��o");
		} else {
			System.out.println("Aluno Aprovado");
		}
	}

}
