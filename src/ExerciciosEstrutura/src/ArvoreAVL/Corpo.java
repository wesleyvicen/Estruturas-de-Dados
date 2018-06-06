package ArvoreAVL;

import java.util.Scanner;

public class Corpo {
	Scanner scan = new Scanner(System.in);
	ArvoreAvl arvore = new ArvoreAvl();

	public void entrada() {
		int opcao = 5;
		while (opcao != 0) {
			System.out.println("\n1 INSERIR");
			System.out.println("2 REMOVER");
			System.out.println("3 EXIBIR ( Em-ordem )");
			System.out.println("0 SAIR");
			opcao = scan.nextInt();
			if (opcao == 1)
				inserir();
			else if (opcao == 2)
				remover();
			else if (opcao == 3)
				exibir();

		}

	}

	private void exibir() {
		System.out.print("\n Em ordem: ");
		arvore.emordem();
		System.out.print("\n");
	}

	private void remover() {
		System.out.println("Insira o que quer remover: ");
		arvore.remove(scan.nextInt());

	}

	private void inserir() {
		System.out.print("Numero de elementos que deseja inserir: ");
		int elementos = scan.nextInt();
		for (int i = 1; i <= elementos; i++) {
			System.out.print(i + "a Elemento: ");
			int chave = scan.nextInt();
			arvore.inserir(chave);
			System.out.print("\n");
		}

	}
}
