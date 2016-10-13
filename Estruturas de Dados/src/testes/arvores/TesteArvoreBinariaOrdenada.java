package testes.arvores;

import arvores.ArvoreBinariaOrdenada;

public class TesteArvoreBinariaOrdenada {

	public static void main(String[] args) {
		ArvoreBinariaOrdenada<Integer> abo = new ArvoreBinariaOrdenada<Integer>();

		abo.adicionar(3);
		abo.adicionar(1);
		abo.adicionar(10);
		abo.adicionar(7);
		abo.adicionar(4);
		abo.adicionar(15);
		abo.adicionar(12);
		abo.adicionar(30);
		abo.adicionar(123);
		abo.adicionar(567);
		abo.adicionar(789);
		abo.adicionar(42);
		abo.adicionar(51);
		abo.adicionar(11);
		
		abo.imprimir(ArvoreBinariaOrdenada.EM_ORDEM);
		
	}

}
