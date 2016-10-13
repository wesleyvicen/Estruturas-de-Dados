package testes.arvores;

import arvores.ArvoreBinariaOrdenada;

public class TesteArvoreBinariaOrdenada {

	public static void main(String[] args) {
		ArvoreBinariaOrdenada<Integer> abo = new ArvoreBinariaOrdenada<Integer>();

		abo.adicionar(12);
		abo.adicionar(2);
		abo.adicionar(4);
		abo.adicionar(6);
		abo.adicionar(3);
		abo.adicionar(2);
		abo.adicionar(5);

	}

}
