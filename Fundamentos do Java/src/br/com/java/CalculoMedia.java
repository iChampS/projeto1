package br.com.java;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// A linha abaixo cria variáveis
		float nota1, nota2, media;
		// Entrada
		// Linhas abaixo cria cabeçalho
		System.out.println("<><><> Média do Aluno <><><>");
		System.out.println(" ");
		System.out.print("Digite a Nota 1: ");
		// A linha abaixo cria um objeto de nome teclado usando Scanner
		Scanner teclado = new Scanner(System.in);
		// A linha abaixo usa o objeto teclado para capturar o que foi
		//digitado no console e armazenar na variável notal1
		nota1 = teclado.nextFloat();
		System.out.print("Digite a Nota 2: ");
		nota2 = teclado.nextFloat();
		// Processamento
		media = (nota1+ nota2) /2;
		// Saída
		// + Concatena(junta) um texto com o conteúdo da variável média
		System.out.println("Média Final: " + media);
		// Estruta condicional para verificar status do aluno:
		// Menor ou igual a 2 = reprovado
		// Entre 2 e 5 = recuperação
		// Maior ou igual a 5 = aprovado
		if (media <= 2) {
			System.out.println("Aluno Reprovado");
		} else if (media > 2 && media <5) {
			System.out.println("Aluno de Recuperação");
		} else {
			System.out.println("Aluno Aprovado");
		}
	}

}
