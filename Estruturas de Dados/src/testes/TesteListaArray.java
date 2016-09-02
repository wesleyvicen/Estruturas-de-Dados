package testes;

import listas.ListaArray;

public class TesteListaArray {
	public static void main(String[] args) {
		ListaArray<String> la = new ListaArray<String>();
		la.adicionar("b");
		la.adicionar("d");
		la.adicionar("a");
		la.adicionar("c");
		System.out.println(la);
		System.out.println("size = " + la.size());
		la.remover("c");
		System.out.println(la);
		System.out.println("size = " + la.size());

	}
}
