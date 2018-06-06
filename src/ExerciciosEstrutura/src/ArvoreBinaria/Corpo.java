package ArvoreBinaria;

import java.util.Scanner;

public class Corpo {
	Scanner scan = new Scanner(System.in);
	String elemento = null;
	ArvoreBinaria arvore = new ArvoreBinaria();

	public void entrada() {
		int opcao = 5;
		while (opcao != 0) {
			System.out.println("\n1 INSERIR");
			System.out.println("2 REMOVER");
			System.out.println("3 EXIBIR ( Pr?-ordem )");
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
		System.out.print("\n Pr?-ordem: ");
		arvore.exibir(arvore.root);
		System.out.print("\n");
	}

	public void inserir() {

		System.out.println("Entre com um elemento char: (Apenas uma Letra)");
		arvore.inserir(scan.next().charAt(0));

	}

	public void remover() {

		System.out.println("Insira o que quer remover: ");
		arvore.remove(scan.next().charAt(0));
	}
}
