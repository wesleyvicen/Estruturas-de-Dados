package ArvoreTeste;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArvoreAvl arvore = new ArvoreAvl();
		int opcao = 5;
		while (opcao != 0) {
			System.out.println("\n1 INSERIR");
			System.out.println("2 REMOVER");
			System.out.println("3 EXIBIR ( Pré-ordem )");
			System.out.println("0 SAIR");
			opcao = scan.nextInt();
			if (opcao == 1) 
				arvore.inserir(scan.nextInt());
			 else if (opcao == 2) 
				arvore.remover(scan.nextInt());
			 else if (opcao == 3) 
				System.out.println(arvore.inorder());
			
		}


	}

}
