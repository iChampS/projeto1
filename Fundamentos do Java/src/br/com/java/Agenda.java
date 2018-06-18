package br.com.java;

public class Agenda {

	public static void main(String[] args) {
		String[][] agenda = { { "Bill Gates", "1111-1111", "bill@outlook.com" },
				{ "Linus Torvalds", "2222-2222", "linus@gmail.com" },
				{ "Steve Jobs", "3333-3333", "steve@icloud.com" } };
		// Recuperar o e-mail do Linus Torvalds
		// System.out.println("Recuperar e-mail: " + agenda[1][2]);
		// Alterar o telefone do Bill Gates
		// agenda[0][1] = "9999-9999";
		// System.out.println(agenda[0][1]);
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("_____________________");
			for (int j = 0; j < agenda[i].length; j++) {
				System.out.println(agenda[i][j]);

			}
		}

	}

}
