package testes;

import listas.ListaLigada;

public class TesteListaLigada {
	public static void main(String[] args) {
		
		ListaLigada<String> ll = new ListaLigada<String>();
		
		ll.adicionar("d");
		ll.adicionar("z");
		ll.adicionar("x");
		ll.adicionar("r");
		ll.adicionar("y");
		ll.adicionar("a");
		ll.adicionar("b");
		ll.adicionar("t");
		ll.adicionar("c");
		ll.adicionar("f");
		ll.adicionar("v");
		ll.adicionar("s");
		ll.adicionar("u");
		
		
		ll.remover("b");
		ll.remover("c");
		ll.remover("d");
		ll.remover("f");
		ll.remover("r");
		
		System.out.println(ll);

		
	}
}
