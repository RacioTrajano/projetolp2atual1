package br.ufrn.imd.main;

import java.util.Scanner;

import br.ufrn.imd.dominio.Artigo;
import br.ufrn.imd.dominio.Biblioteca;
import br.ufrn.imd.dominio.ItemAcervo;
import br.ufrn.imd.dominio.Livro;
import br.ufrn.imd.dominio.Revista;

public class BibliotecaView {

	public static void main(String[] args) {
		
		
		Biblioteca library = new Biblioteca();
		
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.err
						.println("Digite a opção desejada: \n" 
						+ "1 - novo Livro \n" 
						+ "2 - novo Artigo \n"
						+ "3 - nova Revista \n"
						+ "4 - Verificar Disponibilidade \n"
						+ "5 - listar Acervo \n"
						+ "6 - Fazer aluguel \n"
						+ "7 - Fazer devolução \n"
						+ "8 - Verifica o tipo do Item do acervo \n"
						+ "9 - opções \n" 
						+ "0 - Sair");
				int opcao = Integer.parseInt(sc.nextLine());
				switch (opcao) {
				case 1:
					System.out.println("Digite o nome do Livro");
					String t1 = sc.nextLine();
					Livro c = new Livro();
					c.setTitulo(t1);
					library.addAcervo(c);
					break;
				case 2:
					System.out.println("Digite o nome do Artigo");
					String t2 = sc.nextLine();
					Artigo a = new Artigo();
					a.setTitulo(t2);
					library.addAcervo(a);
					break;
				case 3:
					System.out.println("Digite o nome da Revista");
					String t3 = sc.nextLine();
					Revista r = new Revista();
					r.setTitulo(t3);
					library.addAcervo(r);
					break;
				case 4:
					library.listarItensDisponiveis();
					break;
				case 5:
					library.imprimeCadastrados();
					break;
				case 6:
					System.out.println("Digite o nome do Item para aluguel");
					String t6 = sc.nextLine();
					library.fazerAluguel(t6);
					break;
				case 7:
					System.out.println("Digite o nome do Item para devolução");
					String t7 = sc.nextLine();
					library.fazerDevolucao(t7);
					break;
				case 8:
					System.out.println("Digite o nome do Item para verficação");
					String t8 = sc.nextLine();
					library.verificaHeranca(t8);
					break;
				case 0:
					System.exit(0);
				}

			}
		} finally {
			sc.close();
		}

	}

}
