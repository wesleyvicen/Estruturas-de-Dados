package testes.listas;

import listas.ListaArray;

public class TesteListaArray {
	public static void main(String[] args) {
		ListaArray<String> la = new ListaArray<String>(new String[] { "xyz", "acb", "abc", "23", "efg", "lmn" });
		System.out.println(la);
		System.out.println(la.get(3) + " ____ " + la.indexOf(la.get(3)));
		la.remover("efg");
		System.out.println(la);

		for (int i = 0; i < 100; i++) {
			la.adicionar("a" + i);
		}
		System.out.println(la);
		for (int i = 0; i < 90F; i++) {
			la.remover("a" + i);
		}
		System.out.println(la);

	}
}
