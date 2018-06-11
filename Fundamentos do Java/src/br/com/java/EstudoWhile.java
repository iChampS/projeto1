package br.com.java;

import java.util.Scanner;

public class EstudoWhile {

	public static void main(String[] args) {
		int x = 11;
		int y = 11;
		//Executa o laço enquanto a condição for verdadeira
		while (x < 10) {
			System.out.println(x + " " + "teste while");
			x++;			
		}
		System.out.println(" ");
		do {
			System.out.println(y + " " + "teste do while");
			y++;			
		//Executa o laço pelo menos uma vez independente da condição
		} while (y < 10);		
		
	}

}
