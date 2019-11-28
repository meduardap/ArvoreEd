package Arvore;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		Tree arv = new Tree();
		int opcao;
		long x;
		System.out.print("\n Programa Arvore ");
		do {
			System.out.print("\n--");
			System.out.print("\nEscolha uma opcao:");
			System.out.print("\n --1: Inserir");
			System.out.print("\n --2: Excluir");
			System.out.print("\n --3: Buscar");
			System.out.print("\n --4: Exibir");
			System.out.print("1\n --5: Sair do programa");
			System.out.print("\n--");
			System.out.print("\n-> ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1: {
				System.out.print("\n Digite o valor -> ");
				x = sc.nextLong();
				arv.inserir(x);
				break;
			}
			case 2: {
				System.out.print("\n Digite o valor  -> ");
				x = sc.nextLong();
				if (!arv.remover(x))
					System.out.print("\n Valor nao encontrado!");
				;
				break;
			}
			case 3: {
				System.out.print("\n Digite o valor  -> ");
				x = sc.nextLong();
				if (arv.buscar(x) != null)
					System.out.print("\n Valor Encontrado");
				else
					System.out.print("\n Valor nao encontrado!");
				break;
			}
			case 4: {
				arv.caminhar();
				break;
			}
			} // fim switch
		} while (opcao != 5);

	}

}
