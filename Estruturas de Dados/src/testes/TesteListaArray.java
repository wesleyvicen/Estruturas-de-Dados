package testes;

import listas.ListaArray;

public class TesteListaArray {
	public static void main(String[] args) {
		ListaArray<String> la = new ListaArray<String>();
		la.adicionar("b");
		la.adicionar("d");
		la.adicionar("a");
		la.adicionar("c");
		la.adicionar("ba");
		la.adicionar("dc");
		la.adicionar("ad");
		la.adicionar("ce");
		la.adicionar("bcd");
		la.adicionar("def");
		la.adicionar("ad");
		la.adicionar("ce");
		la.adicionar("bcd");
		la.adicionar("def");
		System.out.println(la);
		System.out.println("size = " + la.size());

	}
}
