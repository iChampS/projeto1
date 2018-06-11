package br.com.java;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		System.out.println("1. Windows");
		System.out.println("2. Linux");
		System.out.print("Digite a opção desejada: ");
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1: 
			Windows(); //Executar o método
			break;
		case 2:
			Linux();
			break;
		default: //Caso nenhuma opção selecionado
			System.out.println("Opção inválida");
			break;			
		}		
	}	
	//Criando um método
	static void Windows() {
		System.out.println("Carregando o Windows.....");
	}
	static void Linux() {
		System.out.println("Carregando o Linux.....");		
	}

}
