package br.com.java;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		System.out.println("1. Windows");
		System.out.println("2. Linux");
		System.out.print("Digite a op��o desejada: ");
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1: 
			Windows(); //Executar o m�todo
			break;
		case 2:
			Linux();
			break;
		default: //Caso nenhuma op��o selecionado
			System.out.println("Op��o inv�lida");
			break;			
		}		
	}	
	//Criando um m�todo
	static void Windows() {
		System.out.println("Carregando o Windows.....");
	}
	static void Linux() {
		System.out.println("Carregando o Linux.....");		
	}

}
